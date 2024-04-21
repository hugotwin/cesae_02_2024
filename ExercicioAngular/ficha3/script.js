"use strict";
/*a
let num:number = Number(prompt("please input the number os students"))

let sum:number=0;
for(let n:number=0; n<num;n++){
    sum+=Number(prompt("please input the grade"))
    }
alert("the average is "+(sum/num).toFixed(0));
*/
/* c
let num:number = Number(prompt("please input the number os students"))
let count:number=0;
for(let n:number=0; n<num;n++){
   let grade:number = Number(prompt("please input the grade"))
    if(grade<10){
        count++;
    }
}
alert("the number of grades below 10  is " + count )
*/
/*c
alert("Define a range to display even numbers.");
let x: number = Number(prompt("Enter the starting number (X):"));
let y: number = Number(prompt("Enter the ending number (Y):"));

if (x<y){
    for(let n:number=x;n<=y; n++ )
    {
        if(n%2==0){alert(n)}

    }

}else{

    for(let n:number=y;n<=x; n++ )
    {
        if(n%2==0){alert(n)}
    }

}

*/
/*d
let num :number;
let count:number=1;
let average :number=0;
let sum:number=0;
alert("Entry of grades if you whant to leave please put an number below 0")
num = Number(prompt("grade input"))
while(num!=0){

    num = Number(prompt("grade input"))
    sum+=num
    count++;
    average=sum/count;

}
alert("the average is "+average);
*/
/*e
let age: number = Number(prompt("Enter age :"));
let number: number = Number(prompt("Enter the number of students"));
let students: number = 0;
for (let i = 0; i < number; i++) {
    let studentAge: number = Number(prompt(`Enter the age of student ${i + 1}:`));
    if (studentAge > age) {
        students++;
    }
}
let percentage: number = (students / number) * 100;

// Display the result
alert(`the students above the age limit (${age} years): ${percentage.toFixed(2)}%`);

*/
//f
let max = 0;
let count = 0;
while (count < 5) {
    let number = Number(prompt("Enter the number "));
    if (number % 2 != 0) {
        count++;
    }
    if (number % 2 == 0 && number > max) {
        max = number;
    }
}
if (max == 0) {
    alert("there were not any number that were even ");
}
else {
    alert("the maximum even number is " + max);
}
;
