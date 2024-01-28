//
//  NewsListModel.swift
//  iosApp
//
//  Created by Anna Zharkova on 03.10.2021.
//  Copyright © 2021 orgName. All rights reserved.
//


import Foundation
import SwiftUI
import shared

class ChampionsListModel : ObservableObject {
   private lazy var vm: ChampionsViewModel? = {
        let vm = KoinDIFactory.shared.resolve(clazz_:  ChampionsViewModel.self) as? ChampionsViewModel
        vm?.newsFlow.collect(collector: itemsCollector, completionHandler: {_ in})
        return vm
    }()
    
    lazy var itemsCollector: Observer = {
        let collector = Observer { [weak self] value in
            guard let self = self else {return}
            if let value = value as? [ChampionObj] {
                self.items = value
            }
        }
        return collector
    }()
    
    @Published var items: [ChampionObj] = [ChampionObj]()
    
    func loadNews() {
        vm?.loadData()
    }
}
