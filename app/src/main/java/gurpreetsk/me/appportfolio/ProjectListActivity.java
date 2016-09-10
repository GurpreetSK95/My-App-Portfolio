package gurpreetsk.me.appportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ProjectListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project_list);
    }

    public void GetPopularMoviesProject(View view) {
        Toast.makeText(this, "This button will launch my Popular Movies project!", Toast.LENGTH_SHORT).show();
    }

    public void GetStockHawkProject(View view) {
        Toast.makeText(this, "This button will launch my Stock Hawk project!", Toast.LENGTH_SHORT).show();
    }

    public void GetBuildItBiggerProject(View view) {
        Toast.makeText(this, "This button will launch my Build It Bigger project!", Toast.LENGTH_SHORT).show();
    }

    public void GetMaterialAppProject(View view) {
        Toast.makeText(this, "This button will launch my Make Your App Material project!", Toast.LENGTH_SHORT).show();
    }

    public void GetGoUbiquitousProject(View view) {
        Toast.makeText(this, "This button will launch my Go Ubiquitous project!", Toast.LENGTH_SHORT).show();
    }

    public void GetCapstoneProject(View view) {
        Toast.makeText(this, "This button will launch my Capstone project!", Toast.LENGTH_SHORT).show();
    }

}
