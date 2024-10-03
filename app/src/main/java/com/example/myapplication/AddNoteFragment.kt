package com.example.notepad

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.notepad.databinding.FragmentAddNoteBinding

class AddNoteFragment : Fragment() {

    // Declaração da variável de binding para acessar o layout
    private var _binding: FragmentAddNoteBinding? = null
    private val binding get() = _binding!!  // Acessor seguro da variável de binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inicializa o binding usando o layout associado ao fragmento
        _binding = FragmentAddNoteBinding.inflate(inflater, container, false)
        return binding.root  // Retorna a visualização associada ao layout
    }

    override fun onDestroyView() {
        super.onDestroyView()
        // Libera o binding para evitar vazamentos de memória
        _binding = null
    }
}
