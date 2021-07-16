
//element variables
let tabI7Visibiliy = document.getElementById("i7");
let tabI8Visibiliy = document.getElementById("i8");
let tabI9Visibiliy = document.getElementById("i9");

let tabl4Style = document.getElementById("l4");
let tabl5Style = document.getElementById("l5");
let tabl6Style = document.getElementById("l6");

//event listeners
document.getElementById("l4").addEventListener("click", tab7Switch);
document.getElementById("l4").addEventListener("click", getPendingRequests);
document.getElementById("l5").addEventListener("click", tab8Switch);
document.getElementById("l5").addEventListener("click", getPastRequests);
document.getElementById("l6").addEventListener("click", tab9Switch);



//onClick function
function tab7Switch(){
    if(tabI7Visibiliy.style.visibility != "visible"){
        tabl4Style.style.color = "rgb(249, 255, 170)";
        tabl4Style.style.backgroundColor = "rgba(249, 255, 170, 0.849)";
        tabl4Style.style.textShadow = "0rem 0rem .1rem black, "+
        "-.1rem .1rem .5rem black, "+
        "-.2rem .2rem 1rem black, "+
        "-.3rem .3rem 1.5rem black";
        tabl4Style.style.boxShadow = "0rem 0rem .1rem black, "+
        "-.1rem .1rem .5rem black, "+
        "-.2rem .2rem 1rem black";
        tabl4Style.style.border = ".2rem solid black";

        tabl5Style.style.color = "black";
        tabl5Style.style.backgroundColor = "rgba(0, 0, 0, 0.849)";
        tabl5Style.style.textShadow = "0rem 0rem .1rem rgb(249, 255, 170), "+
        "-.1rem .1rem .5rem rgb(249, 255, 170), "+
        "-.2rem .2rem 1rem rgb(249, 255, 170), "+
        "-.3rem .3rem 1.5rem rgb(249, 255, 170)";
        tabl5Style.style.boxShadow = "0rem 0rem .1rem rgb(249, 255, 170), "+
        "-.1rem .1rem .5rem rgb(249, 255, 170), "+
        "-.2rem .2rem 1rem rgb(249, 255, 170)";
        tabl5Style.style.border = ".2rem solid black";

        tabl6Style.style.color = "black";
        tabl6Style.style.backgroundColor = "rgba(0, 0, 0, 0.849)";
        tabl6Style.style.textShadow = "0rem 0rem .1rem rgb(249, 255, 170), "+
        "-.1rem .1rem .5rem rgb(249, 255, 170), "+
        "-.2rem .2rem 1rem rgb(249, 255, 170), "+
        "-.3rem .3rem 1.5rem rgb(249, 255, 170)";
        tabl6Style.style.boxShadow = "0rem 0rem .1rem rgb(249, 255, 170), "+
        "-.1rem .1rem .5rem rgb(249, 255, 170), "+
        "-.2rem .2rem 1rem rgb(249, 255, 170)";
        tabl6Style.style.border = ".2rem solid black";
        
        tabI7Visibiliy.style.visibility = "visible";
        tabI8Visibiliy.style.visibility = "collapse";
        tabI9Visibiliy.style.visibility = "collapse";
    }
}

function tab8Switch(){
    if(tabI8Visibiliy.style.visibility != "visible"){
        tabl4Style.style.color = "black";
        tabl4Style.style.backgroundColor = "rgba(0, 0, 0, 0.849)";
        tabl4Style.style.textShadow = "0rem 0rem .1rem rgb(249, 255, 170), "+
        "-.1rem .1rem .5rem rgb(249, 255, 170), "+
        "-.2rem .2rem 1rem rgb(249, 255, 170), "+
        "-.3rem .3rem 1.5rem rgb(249, 255, 170)";
        tabl4Style.style.boxShadow = "0rem 0rem .1rem rgb(249, 255, 170), "+
        "-.1rem .1rem .5rem rgb(249, 255, 170), "+
        "-.2rem .2rem 1rem rgb(249, 255, 170)";
        tabl4Style.style.border = ".2rem solid black";

        tabl5Style.style.color = "rgb(249, 255, 170)";
        tabl5Style.style.backgroundColor = "rgba(249, 255, 170, 0.849)";
        tabl5Style.style.textShadow = "0rem 0rem .1rem black, "+
        "-.1rem .1rem .5rem black, "+
        "-.2rem .2rem 1rem black, "+
        "-.3rem .3rem 1.5rem black";
        tabl5Style.style.boxShadow = "0rem 0rem .1rem black, "+
        "-.1rem .1rem .5rem black, "+
        "-.2rem .2rem 1rem black";
        tabl5Style.style.border = ".2rem solid black";

        tabl6Style.style.color = "black";
        tabl6Style.style.backgroundColor = "rgba(0, 0, 0, 0.849)";
        tabl6Style.style.textShadow = "0rem 0rem .1rem rgb(249, 255, 170), "+
        "-.1rem .1rem .5rem rgb(249, 255, 170), "+
        "-.2rem .2rem 1rem rgb(249, 255, 170), "+
        "-.3rem .3rem 1.5rem rgb(249, 255, 170)";
        tabl6Style.style.boxShadow = "0rem 0rem .1rem rgb(249, 255, 170), "+
        "-.1rem .1rem .5rem rgb(249, 255, 170), "+
        "-.2rem .2rem 1rem rgb(249, 255, 170)";
        tabl6Style.style.border = ".2rem solid black";
        
        
        tabI7Visibiliy.style.visibility = "collapse";
        tabI8Visibiliy.style.visibility = "visible";
        tabI9Visibiliy.style.visibility = "collapse";
    }
}

function tab9Switch(){
    if(tabI9Visibiliy.style.visibility != "visible"){
        tabl4Style.style.color = "black";
        tabl4Style.style.backgroundColor = "rgba(0, 0, 0, 0.849)";
        tabl4Style.style.textShadow = "0rem 0rem .1rem rgb(249, 255, 170), "+
        "-.1rem .1rem .5rem rgb(249, 255, 170), "+
        "-.2rem .2rem 1rem rgb(249, 255, 170), "+
        "-.3rem .3rem 1.5rem rgb(249, 255, 170)";
        tabl4Style.style.boxShadow = "0rem 0rem .1rem rgb(249, 255, 170), "+
        "-.1rem .1rem .5rem rgb(249, 255, 170), "+
        "-.2rem .2rem 1rem rgb(249, 255, 170)";
        tabl4Style.style.border = ".2rem solid black";

        tabl5Style.style.color = "black";
        tabl5Style.style.backgroundColor = "rgba(0, 0, 0, 0.849)";
        tabl5Style.style.textShadow = "0rem 0rem .1rem rgb(249, 255, 170), "+
        "-.1rem .1rem .5rem rgb(249, 255, 170), "+
        "-.2rem .2rem 1rem rgb(249, 255, 170), "+
        "-.3rem .3rem 1.5rem rgb(249, 255, 170)";
        tabl5Style.style.boxShadow = "0rem 0rem .1rem rgb(249, 255, 170), "+
        "-.1rem .1rem .5rem rgb(249, 255, 170), "+
        "-.2rem .2rem 1rem rgb(249, 255, 170)";
        tabl5Style.style.border = ".2rem solid black";

        tabl6Style.style.color = "rgb(249, 255, 170)";
        tabl6Style.style.backgroundColor = "rgba(249, 255, 170, 0.849)";
        tabl6Style.style.textShadow = "0rem 0rem .1rem black, "+
        "-.1rem .1rem .5rem black, "+
        "-.2rem .2rem 1rem black, "+
        "-.3rem .3rem 1.5rem black";
        tabl6Style.style.boxShadow = "0rem 0rem .1rem black, "+
        "-.1rem .1rem .5rem black, "+
        "-.2rem .2rem 1rem black";
        tabl6Style.style.border = ".2rem solid black";
        
        
        tabI7Visibiliy.style.visibility = "collapse";
        tabI8Visibiliy.style.visibility = "collapse";
        tabI9Visibiliy.style.visibility = "visible";
    }
}

const url = 'http://localhost:8080/P1-jmwallace77/';

async function getPendingRequests(){

    let userId = {
        userId: localStorage.getItem("userData")
    }

    let response = await fetch(url + "managerGetPending", {
        method: "POST",
        body: JSON.stringify(userId)
    });

    if(response.status === 200){

        console.log(response);

        data = await response.json();

        let dataList = document.getElementById('requestList');
        let input = document.getElementById('requests');
        let pendingList = document.getElementById("pendingList")

        while( pendingList.firstChild ){
            pendingList.removeChild( pendingList.firstChild );
        }
        while( dataList.firstChild ){
            dataList.removeChild( dataList.firstChild );
        }
        for(let pendingReimb of data){

            let listItem = document.createElement('li');
            listItem.innerHTML = pendingReimb.typeId.type + " amount: $" + pendingReimb.amount + " for: " + pendingReimb.author.firstName + " " + pendingReimb.author.lastName;
            pendingList.appendChild(listItem);

            let options = document.createElement('option');
            options.setAttribute('id', pendingReimb.id);
            console.log(options.getAttribute('id'));
            options.setAttribute('name', pendingReimb.typeId.type + " amount: $" + pendingReimb.amount + " for: " + pendingReimb.author.firstName + " " + pendingReimb.author.lastName);
            options.value = pendingReimb.typeId.type + " amount: $" + pendingReimb.amount + " for: " + pendingReimb.author.firstName + " " + pendingReimb.author.lastName;
            dataList.appendChild(options);
        }

        input.placeholder = "e.g. first name";

    }
}

async function getPastRequests(){

    let userId = {
        userId: localStorage.getItem("userData")
    }

    let response = await fetch(url + "managerGetPast", {
        method: "POST",
        body: JSON.stringify(userId)
    });

    if(response.status === 200){

        console.log(response);

        data = await response.json();

        let pastList = document.getElementById("pastList")

        while( pastList.firstChild ){
            pastList.removeChild( pastList.firstChild );
        }
        
        for(let pastReimb of data){

            let listItem = document.createElement('li');
            listItem.innerHTML = pastReimb.typeId.type + " amount: $" + pastReimb.amount + " for: " + pastReimb.author.firstName + " " + pastReimb.author.lastName;
            pastList.appendChild(listItem);

        }

    }
}

document.addEventListener("DOMContentLoaded", getPendingRequests);

document.getElementById("acceptButton").addEventListener("click", acceptReimbursement);
document.getElementById("rejectButton").addEventListener("click", rejectReimbursement);

async function acceptReimbursement(){
    console.log(requests.value);
    let selectedOption = document.getElementById("requestList").options.namedItem(requests.value);
    console.log(selectedOption);
    let reimbId;
    if (selectedOption) {
        reimbId = selectedOption.getAttribute('id');
        console.log(reimbId);
        let userInfo = localStorage.getItem("userData").split(",");
        for(let info of userInfo){
            if(info == 1){
                let acceptance = {
                    reimbId: reimbId,
                    status: "accepted",
                    userId: info
                }
                let response = await fetch(url + "managerAcceptReimbursement", {
                    method: "POST",
                    body: JSON.stringify(acceptance)
                });
                document.getElementById("requests").value = "";
                selectedOption.remove();
            }
        }
        
    }else {
        console.log("No id found");
    }
    
}

async function rejectReimbursement(){
    
    console.log(requests.value);
    let selectedOption = document.getElementById("requestList").options.namedItem(requests.value);
    console.log(selectedOption);
    let reimbId;
    if (selectedOption) {
        reimbId = selectedOption.getAttribute('id');
        console.log(reimbId);
        let userInfo = localStorage.getItem("userData").split(",");
        for(let info of userInfo){
            if(info == 1){
                let acceptance = {
                    reimbId: reimbId,
                    status: "rejected",
                    userId: info
                }
                let response = await fetch(url + "managerRejectReimbursement", {
                    method: "POST",
                    body: JSON.stringify(acceptance)
                });
                document.getElementById("requests").value = "";
                selectedOption.remove();
            }
        }
        
    }else {
        console.log("No id found");
    }
    
}






