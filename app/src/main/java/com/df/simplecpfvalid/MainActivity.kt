package com.df.simplecpfvalid
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.df.simplecpfvalid.util.toastShort
import com.df.validcpf.ValidCPF
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bt_verificar.setOnClickListener {
            if(ValidCPF.isCPFValid(et_cpf.text.toString())){
                toastShort("OK")
            }else{
                toastShort("Erro")
            }
        }

    }
}
