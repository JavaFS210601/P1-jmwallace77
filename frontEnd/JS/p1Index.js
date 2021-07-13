const url = 'http://localhost:8080/P1-jmwallace77/';

document.getElementById('login').addEventListener('click', login);

async function login(){

    let usersName = document.getElementById("username").value;
    let usersPass = document.getElementById("password").value;

    let user = {
        username: usersName,
        password: usersPass
    }

    let response = await fetch(url + "login", {
        method: "POST",
        body: JSON.stringify(user),
        credentials: 'include'
    });

    if(response.status === 200){
        let data = await response.json();

        let userInfo = data.split(",");
        console.log(userInfo);

        for(let info of userInfo){
            if(info === "employee"){
                localStorage.setItem('userData', userInfo)
                location.replace("http://127.0.0.1:5500/HTML/p1Employee.html");
            }
            if(info === "manager"){
                localStorage.setItem('userData', userInfo)
                location.replace("http://127.0.0.1:5500/HTML/p1Manager.html");
            }   
        }

    }

}