package org.pragyan.dalal18.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.fragment_company_description.*
import org.pragyan.dalal18.R
import org.pragyan.dalal18.data.DalalViewModel
import org.pragyan.dalal18.utils.StockUtils.getDescriptionFromCompanyName
import org.pragyan.dalal18.utils.StockUtils.getImageUrlFromCompanyName

class CompanyDescriptionFragment : Fragment() {

    private lateinit var model: DalalViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_company_description, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        model = activity?.run { ViewModelProviders.of(this).get(DalalViewModel::class.java) } ?: throw Exception("Invalid activity")

        Picasso.with(context).load(getImageUrlFromCompanyName(model.globalStockDetails, arguments?.getString(COMPANY_NAME_KEY))).into(companyImageView)
        companyNameTextView.text = arguments?.getString(COMPANY_NAME_KEY)
        companyDescriptionTextView.text = getDescriptionFromCompanyName(model.globalStockDetails, arguments?.getString(COMPANY_NAME_KEY))
    }

    companion object {
        const val COMPANY_NAME_KEY = "company-name-key"
    }
}