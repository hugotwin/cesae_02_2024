function Ex1(){
    let nome = "Maria";
    alert(nome);
    document.write(nome);
    console.log(nome);
}

E/* x1(); */

function Ex2(){
    let nome ="ana"
    let sobrenome ="silva"
    console.log(nome+sobrenome)

}

function Ex(){
    let nome ="mario";
    let nome = "mendes"
    let idade =20;
    let email = "m@mail.pt"

    console.log(nome+" "+ nome.length)

    console.log(nome + " "+ nome.toUpperCase())

}

function Ex6(){

    let texto = "jbfjdsoairjgdbvojsdgrngdblovkovmqbabab´nba"
    console.log(texto.indexOf("a"));
    console.log(texto.lastIndexOf("b"));

}

function Ex7(){
    let n1 =10;
    let n2 =40;
    console.log("subtracao" (n1+n2));
    // fazer para todas as funcoes aritemeticas
    Math.pow(n1,n2)
    Math.sqrt(n1) // raiz quadrada

    Math.abs(n1) // valor absoluto
    Math.ceil(Math.random()*10)
    Math.floor()
    Math.round()


}


function Ex10(){

    let n1 = 10.4;
    let n2 =11.7;

    console.log( n1+" "+n2);
    console.log(Math.round(n1)+" " + Math.round(n2));
    )

}

// condiçoes

function Ex11(){
    let tem = 38;
    if ( temp>37.5){

        console.log("tem febre")
    }else{
        console.log("saudavel");
    };


}

function Ex12(){
    let tem = 38;
    if ( temp>37.5){

        console.log("tem febre")
    }else if (tem<35){
        console.log("muito baixa");
    }else{
        console.log("saudavel");

    };

    
}


function Ex14(){
    let numero =3;
    if(numero==3){
        console.log("Tres");
    } else if (numero == 2) {
        console.log("2");

    }else{
        console.log("fora de parametros");
            }


}


function  Ex15(){

    let num =1;

    switch(num){
        case 1:
            console.log("numero1");
            break;
        case 2 :
            console.log("numero 2")
    }

}




