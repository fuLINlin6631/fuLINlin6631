$(function () {
    specTop();
    specSecond();
    brandsInfo();
});

function specTop() {
    $.getJSON("findSpecTopInfo", function(json){
        vueProductSpecTop.stlist = json;
    });
}

function specSecond() {
    $.getJSON("findSpecSecondInfo" , function (json) {
        vueProductSpecSecond.splist = json;
    })
}

function brandsInfo() {
    $.getJSON("findBrandsInfo" , function (json) {
        vueProductBrands.brlist = json;
    })
}

var vueProductSpecTop = null;
var vueProductSpecSecond = null;
var vueProductBrands = null;

$(document).ready(function(){
    vueProductSpecTop = new Vue({
        el : "#aaa" ,
        data : {
            stlist : null
        }
    });
    vueProductBrands = new Vue({
        el : "#brand_dl" ,
        data : {
            brlist : null
        }
    });
    vueProductSpecSecond = new Vue({
        el : "#f_type_dl" ,
        data : {
            splist : null
        }
    });
});
