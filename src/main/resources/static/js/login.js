$(function(){
    $.validationEngine.defaults.promptPosition='centerRight'
    $.validationEngine.defaults.addPromptClass='formError-text'

    $("#login").submit(function(){
        if($("#login").validationEngine('validate')){
            let username=$("#loginName").val();//获取用户名
            let password=$("#loginPwd").val();//获取密码
            $.ajax({
                url:this.action,
                type:this.method,
                contentType: 'application/json;charset=UTF-8',
                data:JSON.stringify({
                    username:username,
                    password:password,
                }),
                dataType:'json',
                success:function(result){
                    if(result.errorMsg){
                        layer.msg(result.errorMsg,{icon:5});
                    }else{
                        layer.msg("登录成功！",{icon:6})
                        window.location.href = "/factory/index";
                    }
                }
            })
        }
        return false;
    })
})