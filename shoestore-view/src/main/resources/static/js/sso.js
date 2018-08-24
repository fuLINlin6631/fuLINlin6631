usertoken()
function usertoken() {
    var token = $.cookie("user");
    alert(token);
    if (token){
        $.getJSON("http://localhost:10000/token/"+token,function (data) {
            if(data.status == 200){
                var username = data.data.username;
                var html = username + "，欢迎来到！<a href='http://localhost:10000/loginout/"+token+"'>[退出]</a>";
                $("#loginbar").html(html);
            }
            if (data.status==400){
                location.replace("http://localhost:10000/passport-login.htm");
            }
        })
    }else{
        location.replace("http://localhost:10000/passport-login.htm");
    }
}