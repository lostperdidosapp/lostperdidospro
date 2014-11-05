package info.androidhive.slidingmenu;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class HomeFragment extends Fragment {
	
	public HomeFragment(){}
	
	private Button iniciarSesion;
	private Button registrarse;
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
        iniciarSesion = (Button) rootView.findViewById(R.id.button4);
        registrarse = (Button) rootView.findViewById(R.id.button3);
        iniciarSesion.setOnClickListener(new Button.OnClickListener()
    	{

			@Override
			public void onClick(View v) 
			{
				
				((MainActivity) getActivity()).displayViewNav(1);
				
			}
    		
    	});   
        registrarse.setOnClickListener(new Button.OnClickListener()
    	{

			@Override
			public void onClick(View v) 
			{
				
				((MainActivity) getActivity()).displayViewNav(5);
				
			}
    		
    	});           
         
        return rootView;
    }
}
