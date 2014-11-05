package info.androidhive.slidingmenu;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class ValidarFragment extends Fragment
{
	
	private Button siguiente;
	
	public ValidarFragment (){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_validacion, container, false);
        siguiente= (Button) rootView.findViewById(R.id.button1);
        siguiente.setOnClickListener(new Button.OnClickListener()
    	{

			@Override
			public void onClick(View v) 
			{
				
				((MainActivity) getActivity()).displayViewNav(3);
				
			}
    		
    	});

        
        
        return rootView;
    }
}
