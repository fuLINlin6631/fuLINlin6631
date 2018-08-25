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
        vueProductSpecSecond.sslist = json;
    })
}

function brandsInfo() {
    $.getJSON("findBrandsInfo" , function (json) {
        vueProductBrands.blist = json;
    })
}

var vueProductSpecTop = null;
var vueProductSpecSecond = null;
var vueProductBrands = null;

$(document).ready(function(){
    vueProductSpecTop = new Vue({
        el : "#specTopInfo" ,
        data : {
            stlist : null
        }
    });
    vueProductSpecSecond = new Vue({
        el : "#specTopInfo" ,
        data : {
            sslist : null
        }
    });
    vueProductSpecSecond = new Vue({
        el : "#specTopInfo" ,
        data : {
            blist : null
        }
    });
});