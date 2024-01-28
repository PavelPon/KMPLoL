//
//  NewsItemView.swift
//  NewsItemView
//
//  Created by Anna Zharkova on 09.08.2021.
//

import SwiftUI
import shared

struct NewsItemView: View {
    @State var item: ChampionObj
    
    var body: some View {
        GeometryReader { reader in
            NavigationView {
                ScrollView {
                    VStack(alignment: .leading, spacing: 10) {
                        CachedImage(url: item.id.urlsplashChampion())
                        Text(item.name ).largeTitle()
                        Text(item.title ).smallTitle()
                        Text(item.blurb ).subtextTitle()
//                        Button {
//                            UIApplication.shared.open(URL(string: item.url ?? "")!, options: [:], completionHandler: nil)
//                        } label: {
//                            Text("Show more").smallTitle()
//                        }
                        Spacer()
                    }.padding(EdgeInsets(top: 0, leading: 10, bottom: 0, trailing: 10))
                }
//                .navigationBarItems(leading:  Color.blue.frame(width: 40, height: 40, alignment: .topLeading))
            }
        }
    }
}

