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

            if(data === "employee"){
                location.replace("http://127.0.0.1:5500/HTML/p1Employee.html");
            }
            if(data === "manager"){
                location.replace("http://127.0.0.1:5500/HTML/p1Manager.html");
            }   
    }

}