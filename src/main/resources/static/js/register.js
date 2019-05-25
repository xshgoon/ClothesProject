//等效 window.onload事件（页面加载完成事件）

$(function(){
    $.validationEngine.defaults.promptPosition='centerRight'
    $.validationEngine.defaults.addPromptClass='formError-text'

    $("#register").submit(function(){
        if($("#register").validationEngine('validate')){
            let username=$("#username").val();//获取用户名
            let password=$("#pas1").val();//获取密码
            let phone=$("#pn").val();//获取手机号
            $.ajax({
                url:this.action,
                type:this.method,
                contentType: 'application/json;charset=UTF-8',
                data:JSON.stringify({
                    username:username,
                    password:password,
                    phone:phone
                }),
                dataType:'json',
                success:function(result){
                    if(result.errorMsg){
                        layer.msg(result.errorMsg,{icon:5});
                    }else{
                        layer.msg("注册成功，请前往登录！",{icon:6})
                    }
                }
            })
        }
        return false;
    })
})