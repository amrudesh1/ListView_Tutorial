package treble.amrudesh.com.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] country_arr ={"Afghanistan",
                "Albania", "Algeria", "American Samoa",
                "Angola", "Anguilla", "Antartica",
                "Antigua and Barbuda", "Argentina",
                "Armenia", "Aruba", "Ashmore and Cartier Island",
                "Australia", "Austria", "Azerbaijan"};

        final ArrayList arrayList=new ArrayList(Arrays.asList(country_arr));
        ListView listView=(ListView)findViewById(R.id.list);
        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);
listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(getApplicationContext(), "You Tapped On\t"+arrayList.get(position), Toast.LENGTH_SHORT).show();
    }
});

    }
}
