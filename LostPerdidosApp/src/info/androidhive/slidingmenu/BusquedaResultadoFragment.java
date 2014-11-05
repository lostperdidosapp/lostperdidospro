package info.androidhive.slidingmenu;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class BusquedaResultadoFragment extends Fragment
{
	private Button iniciarSesion;
	private Button registrase;
	private Button encontre;
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_busqueda_resultado, container, false);
        
        iniciarSesion= (Button)rootView.findViewById(R.id.button3);
        registrase= (Button)rootView.findViewById(R.id.button4);
        encontre= (Button)rootView.findViewById(R.id.button1);
        iniciarSesion.setOnClickListener(new Button.OnClickListener()
    	{

			@Override
			public void onClick(View v) 
			{
				
				((MainActivity) getActivity()).displayViewNav(1);
				
			}
    		
    	});
        registrase.setOnClickListener(new Button.OnClickListener()
    	{

			@Override
			public void onClick(View v) 
			{
				
				((MainActivity) getActivity()).displayViewNav(5);
				
			}
    		
    	});
        encontre.setOnClickListener(new Button.OnClickListener()
    	{

			@Override
			public void onClick(View v) 
			{
				
				((MainActivity) getActivity()).displayViewNav(2);
				
			}
    		
    	});        
        
        
        
        return rootView;
    }
}
