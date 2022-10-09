let employee={
    name:"Kavitha",
    age:26,
    location:"Blore",
    sal: 50000,
    getDetails: ()=>{
        return "hello";
    }
};
console.log(employee.name);
console.log(employee.getDetails());
console.log(employee.gender); //undefined//
console.log(employee.getFullDetails());