package com.ieeecimatec.pim2pelod2.ui.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.ieeecimatec.pim2pelod2.R

class GalleryFragment : Fragment() {
    override fun onCreateView(Layoutinflater: LayoutInflater,
                              container: ViewGroup?, savedInstantState: Bundle?): View? {
        return Layoutinflater.inflate(R.layout.fragment_gallery, container, false)

    }

}
