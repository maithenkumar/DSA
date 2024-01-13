//print
console.log("kscmjsamckasjmck");
//variable
nam = "maitheen";
var nam = 232;
console.log(nam);
class mK{
     name(params) {
        
        return params;
    }
}


// const m=new main();
// m.name3("jsnjkscnksj");
const de="jsnjsnks//saskjn\vdasd//sdsd//sd";
const d=de.replace(/j/g,"m")
const a=[{maithee:"sjmxjanscjasc"}]
const cars = ["Saab", "Volvo", "BMW"];
cars[0] = "Opel";
// console.log(a[0].maithee);
console.log(cars)
// const mt=new mK();
// console.log(mt.name(2323));
// const myheading=document.querySelector("h1")
// ;
// myheading.addEventListener("click",()=>{
//     // alert("this is maintain of this tjing")
//     prompt("Please enter your name.");

// })
// myheading.onclick=()=>{
//     myheading="kamsmsackjsa"
//     prompt("Please enter your name.");
// }
function missingNumber(array,n){
    //code here
    let totlSum=0
    let sum=0;
    for(let i=1;i<=n;i++)
        {
            totlSum+=i;
        }
        for(let i=0;i<n-1;i++)
        {
            sum+=array[i];
        } 
    return totlSum-sum;
}
const arr=[1,3,4,5,
6]
console.log(missingNumber(arr,arr.length))

