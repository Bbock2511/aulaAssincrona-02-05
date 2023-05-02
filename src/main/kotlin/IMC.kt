fun main() {
    println("Digite o seu peso em kg:")
    val peso = readln().toDouble()

    println("Digite a sua altura em metros:")
    val altura = readln().toDouble()

    val imc = peso / (altura * altura)

    if (imc < 18.5) {
        println("Seu IMC é $imc e você está abaixo do peso.")
    } else if (imc < 25) {
        println("Seu IMC é $imc e seu peso é normal.")
    } else if (imc < 30) {
        println("Seu IMC é $imc e você está com sobrepeso.")
    } else if (imc < 35) {
        println("Seu IMC é $imc e você está com obesidade grau I.")
    } else if (imc < 40) {
        println("Seu IMC é $imc e você está com obesidade grau II.")
    } else if (imc > 40){
        println("Seu IMC é $imc e você está com obesidade grau III.")
    }
}


