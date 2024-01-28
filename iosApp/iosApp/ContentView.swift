import SwiftUI
import shared

class ViewModel:ObservableObject{
    @Published var champions:[ChampionObj] = []

    func loadChampions(){

    }
}


struct ContentView: View {
//	let greet = Greeting().greet()
@StateObject var viewModel = ViewModel()
	var body: some View {
        Text("greet shared").onAppear{
            viewModel.loadChampions()
        }
	}
}

struct ContentView_Previews: PreviewProvider {
	static var previews: some View {
		ContentView()
	}
}
