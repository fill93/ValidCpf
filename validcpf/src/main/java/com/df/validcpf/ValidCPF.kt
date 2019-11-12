package com.df.validcpf

object ValidCPF {


    /**
     * Entradas para um retorno válido neste método
     *   CPF: NNN.NNN.NNN-NN , NNNNNNNNNNN
     *
     */
    fun isCPFValid ( cpfParam : String ) : Boolean {

        var cpf = cpfParam.trim()
        cpf = cpf.replace(".", "").replace("-", "")
        if (cpf.length != 11) {
            return false
        }

        var tempCpf = cpf.substring(0, 9)

        var digito1 = verificarDigito( 0,8,tempCpf , 10 )
        tempCpf = tempCpf+""+digito1
        var digito2 = verificarDigito( 0,9,tempCpf , 11 )

        if( cpf[9].toString() == digito1.toString() && cpf[10].toString() == digito2.toString()){
            return true
        }
        return false

    }

    fun verificarDigito( x : Int , y : Int , tempCpf : String , mult : Int ) : Int{

        var soma = 0
        var multply = mult

        for ( i in x..y ){
            soma += tempCpf[i].toString().toInt() * multply
            multply -= 1
        }

        var resto = soma % 11

        resto = if ( resto < 2 ) {
            0
        } else {
            11 - resto
        }

        return resto

    }


}