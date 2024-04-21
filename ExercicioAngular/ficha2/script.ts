
/*
a
let num: number = Number(prompt("please enter an number "))

if (num%2==0){alert("par")}else{alert("impar")}*/

/*b

let ExEscrito: number = Number(prompt("please enter an value of written text"))
let Exoral: number = Number(prompt("please enter an value of oral text"))

if(((ExEscrito*0.7)+(Exoral*0.3))<=20) {
    if (((ExEscrito * 0.7) + (Exoral * 0.3)) >= 10) {

        alert("Aproved")

    } else {
        alert("not aproved")
    }
}else{alert("Error in insertion of the values")}
*/

/*
c

let num: number = Number(prompt(" please enter the number hours that you worked "))

if (num>30){
    let total : number = (num-36)*10 + (num)*7.5
    alert(total)
}else{

    let total : number = (num)*7.5
    alert(total)}

*/

/*d

const estadoCivil: number = Number(prompt("what is your civil state 0 single, 0 married):"));
const age: number = Number(prompt("what is your age:"));


switch (estadoCivil) {
    case 0:
        if(age<=25){ alert("Grupo 1 - Solteiros com menos de 25 anos")}else{ alert("rupo 2 - Solteiros com 25 anos ou mais")}

        break;

    case 1:
        if(age<=25){ alert("rupo 3 - Casados com menos de 34 anos")}else{ alert("Grupo 4 - Casados com 34 anos ou mais")}
        break;
    default:
        alert("Estado civil inválido");
        break;
}
*/

/*e

let num: number = Number(prompt("enter an number  1 to 7:"))

switch (num) {
    case 1:
        alert("Sunday")
        break;
    case 2:
        alert("Monday")
        break;
    case 3:
        alert("Tuesday")
        break;
    case 4:
        alert("Wednesday")
        break;
    case 5:
        alert("Thursday")
        break;
    case 6:
       alert("Friday")
        break;
    case 7:
        alert("Saturday")
        break;
    default:
        alert("Número inválido")
}
*/
/*d
const averageBalance: number = Number(prompt("Enter the customer average balance:"));

if (averageBalance <= 200) {
    alert (0);
} else if (averageBalance <= 400) {
    alert(averageBalance * 0.2) // 20% of the average balance
} else if (averageBalance <= 600) {
    alert(averageBalance * 0.3); // 30% of the average balance
} else {
    alert(averageBalance * 0.4); // 40% of the average balance
}
*/

/*g*/

const salary: number = Number(prompt("Enter the employee's salary:"));
const jobCode: number = Number(prompt("Enter the job code (101 for Manager, 102 for Engineer, 103 for Technician):"));

let newSalary: number;

switch (jobCode) {
    case 101: // Manager
        newSalary = salary * 1.25;
        break;
    case 102: // Engineer
        newSalary = salary * 1.20;
        break;
    case 103: // Technician
        newSalary = salary * 1.15;
        break;
    default:
        newSalary = salary * 1.10;
}

let difference: number = newSalary - salary;

let message : String = "Old salary: " + salary + "\nNew salary: " + newSalary + "\nDifference: " + difference
alert(message);









