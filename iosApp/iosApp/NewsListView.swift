import SwiftUI
import shared

struct NewsListView: View{
    @ObservedObject var model = ChampionsListModel()
    
    var body: some View {
        NavigationView {
            List(model.items, id: \.self) { item in
                NavigationLink(destination: NewsItemView(item: item)) {
                    NewsItemRow(item: item)
                }
            }.onAppear{
                model.loadNews()
            }.navigationBarTitle("Champions", displayMode: .inline)
        }
    }
}
