age = 36
switch(age){
case 16..20 : insuranceRate = 0.05 ; break
case 21..22 : insuranceRate = 0.06 ; break
case 23..65 : insuranceRate = 0.07 ; break
default: throw new IllegalArgumentException()
}
println insuranceRate
