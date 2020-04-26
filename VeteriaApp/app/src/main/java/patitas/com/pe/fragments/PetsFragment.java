package patitas.com.pe.fragments;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import patitas.com.pe.R;
import patitas.com.pe.VeteriApp;
import patitas.com.pe.adapters.PetsAdapter;
import patitas.com.pe.models.Pet;
import patitas.com.pe.utils.DividingLineDecoration;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PetsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PetsFragment extends Fragment {
    private RecyclerView rcvPets;
    private List<Pet> pets;

    public PetsFragment() {

    }


    // TODO: Rename and change types and number of parameters
    public static PetsFragment newInstance() {
        PetsFragment fragment = new PetsFragment();

        return fragment;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_pets, container, false);
        rcvPets = (RecyclerView) view.findViewById(R.id.rcvPets);
        return view;
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        refresh();
    }

    @Override
    public void onResume() {
        super.onResume();

        refresh();
    }
    public void refresh() {
        pets = ((VeteriApp) getActivity().getApplicationContext()).getPetList();
        PetsAdapter materialsAdapter = new PetsAdapter(pets);

        rcvPets.setAdapter(materialsAdapter);
        rcvPets.addItemDecoration(new DividingLineDecoration(getActivity()));
        rcvPets.setLayoutManager(
                new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
    }

}
