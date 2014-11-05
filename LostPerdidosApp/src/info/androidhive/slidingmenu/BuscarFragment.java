package info.androidhive.slidingmenu;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class BuscarFragment extends Fragment {
	
	public BuscarFragment(){}
	
	
	private Spinner sp ;
	private Spinner sp1;
	private Spinner sp3;
	private Button siguiente;
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) 
	{
 
        View rootView = inflater.inflate(R.layout.fragment_buscar, container, false);
        
        sp = (Spinner) rootView.findViewById(R.id.spinner1);
        sp1 = (Spinner) rootView.findViewById(R.id.spinner2);
        sp3 = (Spinner) rootView.findViewById(R.id.spinner3);
        siguiente = (Button) rootView.findViewById(R.id.button2);
        
        siguiente.setOnClickListener(new Button.OnClickListener()
        	{

				@Override
				public void onClick(View v) 
				{
					
					((MainActivity) getActivity()).displayViewNav(0);
					
				}
        		
        	});

        tipoAnimal();
		razaPerro();
		colorPerro();
		 WebView myWebView = (WebView) rootView.findViewById(R.id.webView1);
	     myWebView.loadUrl("http://www.ffcconsulting.com/img/pagina/131118_ffc_-_ubicacion_oficina.png");
        
        return rootView;
    }
	

	
	public void tipoAnimal()
	{
        ArrayAdapter adapter = ArrayAdapter.createFromResource(
                getActivity(), R.array.RazaPerro, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp.setAdapter(adapter);
               
	}
	
	public void razaPerro()
	{
		
        ArrayAdapter adapter = ArrayAdapter.createFromResource(
                getActivity(), R.array.RazaPerro, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp1.setAdapter(adapter);
	}
	
	public void colorPerro()
	{
        ArrayAdapter adapter = ArrayAdapter.createFromResource(
                getActivity(), R.array.Color, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp3.setAdapter(adapter);
	}
	
}
