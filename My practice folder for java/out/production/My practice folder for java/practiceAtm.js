function cardNumber{

let Visa = {
		valid:true,
		issuer:"visa",
}

let MastercardO = {
		valid:true,
		issuer:"mastercard",
}

let DiscoverO = {
		valid:true,
		issuer:"discover",
}

let  AmericaExpress = {
		valid:true, 
		issuer:"America Express",
}
let invalid = {
		valid:false,
		reason:"invalid length"
}

if(visa[0] == 4 && number.length == 16){
	return visa;
} 
else if(visa[0] != 4 && number.length != 16){
	return invalid;
}
if(mastercard[0] == 5 && number.length == 16){
	return mastercard;
}else if(mastercard[0] != 5 && number.length != 16){
	return invalid;
}
if(discover[0] == 6 && number.length == 16){
	return discover;
}else if(discover[0] != 6 && number.length != 16){
	return invalid;
}
if(americaExpress[0] == 3 && number.length == 16){
	return americaExpress;
} else if(americaExpress[0] != 3 && number.length != 16){
	return invalid;
}



}




let visa = [4,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16]

let mastercard = [5,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16]

let discover = [6,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16]

let America_express = [4,2,3,4,5,6,7,8,9,10,11,12,13,14,15 ]


result = cardNumber.visa(visa);
console.log(result);

result = cardNumber.mastercard(mastercard);
console.log(mastercard);

result = cardNumber.visa(discover);
console.log(discover);

result = cardNumber.America_express(America_express);
console.log(America_express);


