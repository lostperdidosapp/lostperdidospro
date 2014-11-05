package info.androidhive.slidingmenu;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class IniciarSesionFragment extends Fragment {
	
	public IniciarSesionFragment(){}
	
	private Button home; 
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_iniciar_sesion, container, false);
         
        home = (Button)rootView.findViewById(R.id.button1);
        home.setOnClickListener(new Button.OnClickListener()
    	{

			@Override
			public void onClick(View v) 
			{
				
				((MainActivity) getActivity()).displayViewNav(4);
				
			}
    		
    	});   
        
        return rootView;
    }
}
