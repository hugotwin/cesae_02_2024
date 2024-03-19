

function corAzul(){

       document.body.style.background="blue";

}
function corVerml(){

    document.body.style.background="red";

}
function corAma(){

    document.body.style.background="yellow";

}


function texto(){

    let texto_ = document.getElementById("paragrafo")
    
    texto_.innerHTML="Lorem ipsum dolor sit amet consectetur, adipisicing elit. Ab placeat aliquam eos molestias veritatis aperiam? Numquam laboriosam autem culpa id, debitis enim, rem doloremque ducimus quibusdam exercitationem necessitatibus quaerat sapiente?"


}

function texto__(){


    let texto_=document.getElementById("paragrafo")
    if (texto_.innerText!=""){
    texto_.innerHTML="Lorem ipsum dolor sit amet consectetur, adipisicing elit. Ab placeat aliquam eos molestias veritatis aperiam? Numqua" 

}
}


function aumentar(){
    
   

    let texto_=document.getElementById("paragrafo")
    if (texto_.innerText!=""){
    texto_.style.fontSize="40px" 
    texto_.style.textAlign="center" 


}
}

var verdadeiro=false;
function diminuir(){

    let texto_=document.getElementById("paragrafo")
    


    
    if (texto_.innerText!="" && texto_.style.fontSize!="10px"){
    texto_.style.fontSize="10px" 
    texto_.style.textAlign="right" 
    let b = texto_.style.fontSize; 
    var contador=10; 
    var verdadeiro=true;

}else if ( texto_.style.fontSize=="10px" ){

    

    texto_.style.fontSize="5px"

} 
}

function esconder(){

    let texto = document.getElementById("paragrafo")
    let botao =document.getElementById("texto5")

    if (botao.textContent=="Mostrar"){

        texto.innerHTML="dfdsfdsfadfadfadsffsasdfasdfdffdf"
        botao.textContent="Esconder"

    }else if (botao.textContent=="Esconder"){
        texto.innerHTML=""
        botao.textContent="Mostrar"



    }

}

function esconder2(){


    let texto = document.getElementById("paragrafo2")
    let botao =document.getElementById("texto6")
    texto.innerHTML="sjkdfhjksdafhçkdj"

    if (botao.textContent=="Mostrar"){

        texto.style.display="block"/// o texto se arranja no visibility não
        
        botao.textContent="Esconder"

    }else if (botao.textContent=="Esconder"){
        texto.style.display="none"
        botao.textContent="Mostrar"



    }

}




function esconder3(){


    let texto = document.getElementById("span2")
    let botao =document.getElementById("texto7")
    texto.innerHTML="sjkdfhjksdafhçkdj"

    if (botao.textContent=="Mostrar"){

        texto.style.visibility="visible"/// o texto se arranja no visibility não
        
        botao.textContent="Esconder"

    }else if (botao.textContent=="Esconder"){
        texto.style.display="hiden"
        botao.textContent="Mostrar"



    }

}




