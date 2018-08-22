var extra_validator = extra_validator || {};
var DatePickers = new Class({
    Implements: [Events, Options],
    options: {
        onShow: function(a) {
            if (window.ie6) {
                $$("select").setStyle("visibility", "hidden")
            }
            a.setStyle("visibility", "visible")
        },
        onHide: function(a) {
            if (window.ie6) {
                $$("select").setStyle("visibility", "visible")
            }
            a.setStyle("visibility", "hidden").setStyle("left", -300)
        },
        showDelay: 100,
        hideDelay: 100,
        className: "calendar",
        offsets: {
            x: 0,
            y: 20
        },
        dateformat: "-",
        days: ["SUN", "MON", "TUE", "WED", "THU", "FIR", "STA"],
        months: ["一月", "二月", "三月", "四月", "五月", "六月", "七月", "八月", "九月", "十月", "十一月", "十二月"],
        weekFirstDay: 1
    },
    initialize: function() {
        var c = Array.link(arguments, {
            options: Object.type,
            elements: $defined
        });
        this.setOptions(c.options || null);
        this.lock = false;
        this.datepicker = new Element("div").addEvents({
            mouseover: function() {
                this.lock = true
            }.bind(this),
            mouseout: function() {
                this.lock = false
            }.bind(this)
        });
        if (this.options.className) {
            this.datepicker.addClass(this.options.className)
        }
        var b = new Element("div", {
            "class": "datepicker-top"
        }).inject(this.datepicker);
        this.container = new Element("div", {
            "class": "datepicker"
        }).inject(this.datepicker);
        var a = new Element("div", {
            "class": "datepicker-bottom"
        }).inject(this.datepicker);
        this.datepicker.setStyles({
            position: "absolute",
            top: 0,
            left: 0,
            visibility: "hidden"
        });
        if (c.elements) {
            c.elements.each(function(d) {
                d.store("bindColorPicker", true)
            });
            this.attach(c.elements)
        }
    },
    attach: function(a) {
        $$(a).each(function(c) {
            var b = c.retrieve("datepicker:dateformat", c.get("accept"));
            if (!b) {
                b = this.options.dateformat;
                c.store("datepicker:dateformat", b)
            }
            var f = c.retrieve("datepicker:datevalue", c.get("value"));
            if (!f) {
                f = this.format(new Date(), b);
                c.store("datepicker:datevalue", f)
            }
            c.store("datepicker:current", this.unformat(f, b));
            var d = c.retrieve("datepicker:focus", this.elementFocus.bindWithEvent(this, c));
            var e = c.retrieve("datepicker:blur", this.elementBlur.bindWithEvent(this, c));
            c.addEvents({
                focus: d,
                blur: e
            });
            c.store("datepicker:native", c.get("accept"));
            c.erase("dateformat")
        },
        this);
        return this
    },
    detach: function(a) {
        $$(a).each(function(c) {
            c.removeEvent("onfocus", c.retrieve("datepicker:focus") || $empty);
            c.removeEvent("onblur", c.retrieve("datepicker:blur") || $empty);
            c.eliminate("datepicker:focus").eliminate("datepicker:blur");
            var b = c.retrieve("datepicker:native");
            if (b) {
                c.set("dateformat", b)
            }
        });
        return this
    },
    elementFocus: function(b, a) {
        if (!this.datepicker.retrieve("injected")) {
            this.datepicker.inject(document.body);
            this.datepicker.store("injected", true)
        }
        this.el = a;
        var c = a.retrieve("datepicker:current");
        this.curFullYear = c[0];
        this.curMonth = c[1];
        this.curDate = c[2];
        this.build();
        this.timer = $clear(this.timer);
        this.timer = this.show.delay(this.options.showDelay, this);
        this.position({
            page: a.getPosition()
        })
    },
    elementChange: function() {
        if (this.el.get("real")) {
            var a = new Date(this.curFullYear, this.curMonth, this.curDate);
            var b = new Date();
            if (a < new Date(b.getFullYear(), b.getMonth(), b.getDate())) {
                return alert("日期无效!")
            }
        }
        this.el.store("datepicker:current", Array(this.curFullYear, this.curMonth, this.curDate));
        this.el.set("value", this.format(new Date(this.curFullYear, this.curMonth, this.curDate), this.el.retrieve("datepicker:dateformat")));
        $clear(this.timer);
        this.timer = this.hide.delay(this.options.hideDelay, this)
    },
    elementBlur: function(a) {
        if (!this.lock) {
            $clear(this.timer);
            this.timer = this.hide.delay(this.options.hideDelay, this)
        }
    },
    position: function(d) {
        var b = window.getSize(),
        a = window.getScroll();
        var e = {
            x: this.datepicker.offsetWidth,
            y: this.datepicker.offsetHeight
        };
        var c = {
            x: "left",
            y: "top"
        };
        for (var f in c) {
            var g = d.page[f] + this.options.offsets[f];
            if ((g + e[f] - a[f]) > b[f]) {
                g = d.page[f] - this.options.offsets[f] - e[f]
            }
            this.datepicker.setStyle(c[f], g)
        }
    },
    show: function() {
        this.fireEvent("show", this.datepicker)
    },
    hide: function() {
        this.fireEvent("hide", this.datepicker)
    },
    build: function() {
        $A(this.container.childNodes).each(Element.dispose);
        var c = new Element("table").set({
            cellpadding: "0",
            cellspacing: "0"
        }).inject(this.container);
        var a = this.caption().inject(c);
        var d = this.thead().inject(c);
        var b = this.tbody().inject(c)
    },
    navigate: function(b, c) {
        switch (b) {
        case "m":
            var a = this.curMonth + c;
            if (a < 0 || a == 12) {
                this.curMonth = (a < 0) ? 11: 0;
                this.navigate("y", c)
            } else {
                this.curMonth = a
            }
            break;
        case "y":
            this.curFullYear += c;
            break
        }
        this.el.store("datepicker:current", Array(this.curFullYear, this.curMonth, this.curDate));
        this.el.focus()
    },
    caption: function() {
        var a = {
            prev: {
                month: true,
                year: true
            },
            next: {
                month: true,
                year: true
            }
        };
        var b = new Element("caption");
        var e = new Element("a").addClass("prev").appendText("\x3c");
        var d = new Element("a").addClass("next").appendText("\x3e");
        var c = new Element("span").addClass("year").inject(b);
        if (a.prev.year) {
            e.clone().addEvent("click", 
            function() {
                this.navigate("y", -1)
            }.bind(this)).inject(c)
        }
        new Element("span").set("text", this.curFullYear).addEvent("mousewheel", 
        function(g) {
            g.stop();
            this.navigate("y", (g.wheel < 0 ? -1: 1));
            this.build()
        }.bind(this)).inject(c);
        if (a.next.year) {
            d.clone().addEvent("click", 
            function() {
                this.navigate("y", 1)
            }.bind(this)).inject(c)
        }
        var f = new Element("span").addClass("month").inject(b);
        if (a.prev.month) {
            e.clone().addEvent("click", 
            function() {
                this.navigate("m", -1)
            }.bind(this)).inject(f)
        }
        new Element("span").set("text", this.options.months[this.curMonth]).addEvent("mousewheel", 
        function(g) {
            g.stop();
            this.navigate("m", (g.wheel < 0 ? -1: 1));
            this.build()
        }.bind(this)).inject(f);
        if (a.next.month) {
            d.clone().addEvent("click", 
            function() {
                this.navigate("m", 1)
            }.bind(this)).inject(f)
        }
        return b
    },
    thead: function() {
        var b = new Element("thead");
        var a = new Element("tr").inject(b);
        for (i = 0; i < 7; i++) {
            new Element("th").set("text", this.options.days[(this.options.weekFirstDay + i) % 7].substr(0, 3)).inject(a)
        }
        return b
    },
    tbody: function() {
        var j = new Date(this.curFullYear, this.curMonth, 1);
        var e = ((j.getDay() - this.options.weekFirstDay) + 7) % 7;
        var m = new Date(this.curFullYear, this.curMonth + 1, 0).getDate();
        var c = new Date(this.curFullYear, this.curMonth, 0).getDate();
        var n = (this.el.get("value")) ? this.unformat(this.el.get("value"), this.el.retrieve("datepicker:dateformat")) : false;
        var h = new Date(n[0], n[1], n[2]).getTime();
        var j = new Date();
        var k = new Date(j.getFullYear(), j.getMonth(), j.getDate()).getTime();
        var g = new Element("tbody");
        g.addEvent("mousewheel", 
        function(d) {
            d.stop();
            this.navigate("m", (d.wheel < 0 ? -1: 1));
            this.build()
        }.bind(this));
        for (var f = 1; f < 43; f++) {
            if ((f - 1) % 7 == 0) {
                tr = new Element("tr").inject(g)
            }
            var b = new Element("td").inject(tr);
            var l = f - e;
            var a = new Date(this.curFullYear, this.curMonth, l);
            if (l < 1) {
                l = c + l;
                b.addClass("inactive")
            } else {
                if (l > m) {
                    l = l - m;
                    b.addClass("inactive")
                } else {
                    if (a.getTime() == h) {
                        b.addClass("hilite")
                    } else {
                        if (a.getTime() == k) {
                            b.addClass("today")
                        }
                    }
                    b.addEvents({
                        click: function(d) {
                            this.curDate = d;
                            this.elementChange()
                        }.bind(this, l),
                        mouseover: function(d) {
                            d.addClass("hilite")
                        }.bind(this, b),
                        mouseout: function(o, d) {
                            if (d.getTime() != h) {
                                o.removeClass("hilite")
                            }
                        }.bind(this, [b, a])
                    }).addClass("active")
                }
            }
            b.set("text", l)
        }
        return g
    },
    unformat: function(d, b) {
        var a = d.split(b);
        var c = new Array(3);
        if (a.length < 3 || !a[0] || !a[1] || !a[2]) {
            return [new Date().getFullYear(), new Date().getMonth(), new Date().getDate()]
        }
        c[0] = a[0].toInt();
        c[1] = a[1].toInt() - 1;
        c[2] = a[2].toInt();
        return c
    },
    format: function(d, g) {
        if (d) {
            var c = d.getDate();
            var b = d.getDay();
            var a = this.options.days[b];
            var k = d.getMonth() + 1;
            var e = this.options.months[k - 1];
            var h = d.getFullYear() + "";
            return [h, k, c].join(g)
        } else {
            return ""
        }
    }
});
Element.extend({
    makeCalable: function(a) {
        if (this.retrieve("bindColorPicker")) {
            return
        }
        return new DatePickers([this], a)
    }
});
var validatorMap = new Hash({
    required: ["本项必填", 
    function(b, a) {
        return a != null && a != ""
    }],
    number: ["请录入数值", 
    function(b, a) {
        return a == null || a == "" || !isNaN(a) && !/^\s+$/.test(a)
    }],
    msn: ["请输入MSN", 
    function(b, a) {
        return a == null || a == "" || /\S+@\S+/.test(a)
    }],
    skype: ["请输入Skype", 
    function(b, a) {
        return a == null || a == "" || !/\W/.test(a) || /^[a-zA-Z0-9]+$/.test(a)
    }],
    digits: ["请录入整数", 
    function(b, a) {
        return a == null || a == "" || !/[^\d]/.test(a)
    }],
    unsignedint: ["请录入正整数", 
    function(b, a) {
        return a == null || a == "" || (!/[^\d]/.test(a) && a > 0)
    }],
    unsigned: ["请输入大于等于0的数值", 
    function(b, a) {
        return a == null || a == "" || (!isNaN(a) && !/^\s+$/.test(a) && a >= 0)
    }],
    positive: ["请输入大于0的数值", 
    function(b, a) {
        return a == null || a == "" || (!isNaN(a) && !/^\s+$/.test(a) && a > 0)
    }],
    alpha: ["请录入英文字母", 
    function(b, a) {
        return a == null || a == "" || /^[a-zA-Z]+$/.test(a)
    }],
    alphaint: ["请录入英文字母或者数字", 
    function(b, a) {
        return a == null || a == "" || !/\W/.test(a) || /^[a-zA-Z0-9]+$/.test(a)
    }],
    alphanum: ["请录入英文字母、中文及数字", 
    function(b, a) {
        return a == null || a == "" || !/\W/.test(a) || /^[\u4e00-\u9fa5a-zA-Z0-9]+$/.test(a)
    }],
    unzhstr: ["不能输入中文字符", 
    function(b, a) {
        return a == null || a == "" || !/\W/.test(a) || !/^[\u4e00-\u9fa5]+$/.test(a)
    }],
    date: ["请录入日期格式yyyy-mm-dd", 
    function(b, a) {
        return a == null || a == "" || /^(19|20)[0-9]{2}-([1-9]|0[1-9]|1[012])-([1-9]|0[1-9]|[12][0-9]|3[01])+$/.test(a)
    }],
    delivery_mobile: ["请录入正确的手机/固话", 
    function(b, a) {
        return a == null || a == "" || /^1\d{10}$/.test(a) || /^(\d{3}-\d{8}|\d{4}-\d{7,8})$/.test(a)
    }],
    email: ["请录入正确的Email地址", 
    function(b, a) {
        return a == null || a == "" || /(\S)+[@]{1}(\S)+[.]{1}(\w)+/.test(a)
    }],
    text: ["", 
    function(b, a) {
        return true
    }],
    select: ["", 
    function(b, a) {
        return true
    }],
    radio: ["", 
    function(b, a) {
        return true
    }],
    checkbox: ["", 
    function(b, a) {
        return true
    }],
    url: ["请录入正确的网址", 
    function(b, a) {
        return a == null || a == "" || /^(http|https|ftp):\/\/([A-Z0-9][A-Z0-9_-]*)(:(\d+))?\/?/i.test(a)
    }],
    area: ["请选择完整的地区", 
    function(b, a) {
        return b.getElements("select").every(function(d) {
            var c = d.getValue();
            return c != "" && c != "_NULL_"
        })
    }]
});
var validator = new Abstract({
    test: function(b, f) {
        f = $(f);
        this.bindBlurWithValidator(b, f);
        var l = [],
        h = f.get("required"),
        e = f.get("vtype"),
        k = f.get("caution");
        extra = b.get("extra");
        if (e && e.contains("&&")) {
            e = e.split("&&")
        }
        if ("true" == h) {
            l.include("required")
        }
        if ( !! e) {
            l.include(e)
        }
        l = l.flatten();
        var a = l.every(function(o) {
            var p = true;
            var n = validatorMap.get(o) || window[o];
            if (!n) {
                return p
            }
            var q = k || n[0];
            var m = n[1] || $empty;
            p = m(f, f.getValue() ? f.getValue().trim() : "");
            if (!p) {
                this.showCaution(f, q)
            }
            return p
        },
        this);
        if (!a) {
            return false
        }
        if (extra && extra_validator) {
            var j = extra_validator[extra];
            if (!j) {
                return true
            }
            var d = j[e];
            if (!d) {
                return true
            }
            var g = d[0];
            var c = d[1];
            if (!c(b, (f.getVlaue ? f.getVlaue() : f))) {
                this.showCaution(f, g);
                return false
            }
        }
        return true
    },
    showCaution: function(a, c) {
        var b = $(a).getNext();
        if (b && b.get("name") && b.get("name").contains("validationMsgBox")) {
            return
        }
        if (!c || c.trim() == "") {
            return
        }
        new Element("span", {
            "class": "valierror",
            name: "validationMsgBox",
            html: c
        }).injectAfter(a)
    },
    removeCaution: function(a) {
        var b = $(a).getNext();
        if (b && b.get("name") && b.get("name").contains("validationMsgBox")) {
            return b.remove()
        }
    },
    bindBlurWithValidator: function(c, a) {
        var b = $$(a, a.getFormElements());
        b.removeEvents("blur").addEvent("blur", 
        function() {
            this.removeCaution(a);
            this.test(c, a)
        }.bind(this))
    }
});
if ($("goodsselect")) {
    $("goodsselect").addEvent("click", 
    function(b) {
        b = new Event(b);
        var c = $ES("INPUT", "goodsbody");
        for (var a = 0; a < c.length; a++) {
            c[a].checked = $("goodsselect").checked
        }
    })
}
if ($("pkgselect")) {
    $("pkgselect").addEvent("click", 
    function(b) {
        b = new Event(b);
        var c = $ES("INPUT", "pkgbody");
        for (var a = 0; a < c.length; a++) {
            c[a].checked = $("pkgselect").checked
        }
    })
}
if ($("giftselect")) {
    $("giftselect").addEvent("click", 
    function(b) {
        b = new Event(b);
        var c = $ES("INPUT", "giftbody");
        for (var a = 0; a < c.length; a++) {
            c[a].checked = $("giftselect").checked
        }
    })
}

window.addEvent("domready", 
function() {
    $$("form").each(function(b, a) {
        if ($chk(b.action)) {
            b.addEvent("submit", 
            function(c) {
                if (!b.bindValidator()) {
                    c.stop();
                    return false
                }
            })
        }
    })
});

function selectArea(a, k, e) {
    var a = $(a);
    if (!a) {
        return
    }
    var c = a.value;
    var f = a.getParent();
    var g = a.getNext();
    var h = a.getParent("*[package]");
    var j = h.getElement("input[type=hidden]");
    var d = function(n) {
        var o = [];
        var m = true;
        var l = $ES("select", h);
        l.each(function(p) {
            if (p.getValue() != "_NULL_" && m) {
                o.push($(p.options[p.selectedIndex]).get("text"))
            } else {
                m = false
            }
        });
        if (n.value != "_NULL_") {
            $E("input", h).value = h.get("package") + ":" + o.join("/") + ":" + n.value
        } else {
            $E("input", h).value = function(q) {
                var p = l.indexOf(q) - 1;
                if (p >= 0) {
                    return h.get("package") + ":" + o.join("/") + ":" + l[p].value
                }
                return ""
            } (n)
        }
        j.retrieve("onselect", $empty)(n)
    };
    if (c == "_NULL_" && g && (g.getTag() == "span" && g.hasClass("x-areaSelect"))) {
        a.getNext().empty();
        d(a)
    } else {
        var b = $(a.options[a.selectedIndex]);
        if (b.get("has_c")) {
            new Request({
                onSuccess: function(n) {
                    if (g && (g.getTag() == "span" && g.hasClass("x-region-child"))) {
                        var o = g
                    } else {
                        var o = new Element("span", {
                            "class": "x-region-child"
                        }).inject(f)
                    }
                    function l() {
                        if ($E("input", h)) {
                            $clear(m);
                            d(a);
                            if (n) {
                                o.set("html", n);
                                if (j) {
                                    j.retrieve("sel" + e, $empty)();
                                    j.retrieve("onsuc", $empty)()
                                }
                            } else {
                                a.getAllNext().remove();
                                d(a);
                                j.retrieve("lastsel", $empty)(a)
                            }
                        } else {
                            $E("input", h)
                        }
                    }
                    var m = l.periodical(100)
                }
            }).get("index.php?ctl=tools&act=sel_region&p[0]=" + k + "&p[1]=" + e + "&t=" + $time())
        } else {
            a.getAllNext().remove();
            d(a);
            if (!b.get("has_c") && b.value != "_NULL_") {
                j.retrieve("lastsel", $empty)(a)
            }
        }
    }
};