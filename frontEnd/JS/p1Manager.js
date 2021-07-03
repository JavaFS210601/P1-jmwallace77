
//element variables
let tabI7Visibiliy = document.getElementById("i7");
let tabI8Visibiliy = document.getElementById("i8");
let tabI9Visibiliy = document.getElementById("i9");

let tabl4Style = document.getElementById("l4");
let tabl5Style = document.getElementById("l5");
let tabl6Style = document.getElementById("l6");

//event listeners
document.getElementById("l4").addEventListener("click", tab7Switch);
document.getElementById("l5").addEventListener("click", tab8Switch);
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




