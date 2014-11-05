package info.androidhive.slidingmenu;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class ContactoFragment extends Fragment
{	
	public ContactoFragment (){}
	
	private Button finalizar;
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_contacto, container, false);
        
        finalizar = (Button) rootView.findViewById(R.id.button1);
        finalizar.setOnClickListener(new Button.OnClickListener()
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
