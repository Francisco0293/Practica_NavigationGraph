package mx.edu.itm.link.practica_navigationgraph

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import mx.edu.itm.link.practica_navigationgraph.databinding.FragmentInsideHomeBinding

class InsideHome : Fragment() {

    private lateinit var binding: FragmentInsideHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentInsideHomeBinding.inflate(layoutInflater)

        val argumentoRecibido = arguments?.getString("argumentoPasado")
        binding.textView2.setText(argumentoRecibido)
        return binding.root
    }

}