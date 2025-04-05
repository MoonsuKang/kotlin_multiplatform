import SwiftUI


import SwiftUI
import shared

struct ContentView: View {
    @StateObject private var observable = UserObservable()

    var body: some View {
        NavigationView {
            List(observable.users, id: \.id) { user in
                VStack(alignment: .leading) {
                    Text(user.name)
                        .font(.headline)
                    Text(user.email)
                        .font(.subheadline)
                        .foregroundColor(.gray)
                }
                .padding(.vertical, 4)
            }
            .navigationTitle("Users")
        }
        .onAppear {
            observable.loadUsers()
        }
    }
}

struct ContentView_Previews: PreviewProvider {
	static var previews: some View {
		ContentView()
	}
}
