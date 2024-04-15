function validate(){
    var username=document.getElementById("username").value;
    var email=document.getElementById("email").value;
    var password=document.getElementById("password").value;
    var cpassword=document.getElementById("cpassword").value;

    if(username==null || username==''){
        alert("Name can't be balnk");
        return false;
    }
    else if(password.length<6){
        alert("Password must be atleast 6 characters long.");
        return false;
    }
    else if(password.length>=20){
        alert("Password must be less than 20 characters.");
        return false;
    }
    else if(password!=cpassword){
        alert("Passwords does not match!");
        return false;
    }
    else if(email.indexOf("@")===-1 || email.indexOf(".")===-1){
        alert("Invalid email format.");
        return false;
    }
    else{
        alert("You were registered successfully. Thanks!");
        return true;
    }
}