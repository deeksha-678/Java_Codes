let userDetails={
    name:"tom",
    email:"tom@gmail.com",
    password:"1234",
};
let newDetails={
    name:"tom",
    email:"tom@gmail.com",
};
let result=Object.assign(userDetails,newDetails);
console.log(result);