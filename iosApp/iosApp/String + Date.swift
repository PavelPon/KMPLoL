//
//  String + Date.swift
//  TestNewsSearch
//
//  Created by 1 on 22.02.2019.
//  Copyright © 2019 1. All rights reserved.
//

import Foundation
extension Date {

    func formatToString(_ format: String) -> String {
        let formatter = DateFormatter()
        formatter.dateFormat = format
         let locale = Calendar.current.locale
            formatter.locale = locale

        return formatter.string(from: self)
}
}


extension String {
    
    func urlIconChampion() -> String {
        return "https://ddragon.leagueoflegends.com/cdn/13.23.1/img/champion/\(self).png"
    }
    
    func urlsplashChampion() -> String {
        return "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/\(self)_0.jpg"
    }
    
}
