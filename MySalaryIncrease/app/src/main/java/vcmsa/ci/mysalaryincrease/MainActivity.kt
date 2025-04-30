package vcmsa.ci.mysalaryincrease

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        val edtSalary = findViewById<EditText>(R.id.edtSalary)
        val txtResult = findViewById<TextView>(R.id.txtResults)
        val btnCompute = findViewById<Button>(R.id.btnCompute)
        btnCompute.setOnClickListener{

        val salary = edtSalary.text.toString().toDoubleOrNull() ?:0.0
            val newSalary = salary + (salary * 0.12)
            txtResult.text = "New Salary is R: $newSalary"

        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}


