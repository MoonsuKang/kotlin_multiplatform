import SwiftUI
import shared


struct ContentView: View {
    var body: some View {
        let user = User(id: 1, name: "Alice", email: "alice@example.com")
        let message = DateUtil().getCurrentDateMessage()

        return Text("User: \(user.name), Email: \(user.email)\n\(message)")
            .padding()
    }
}

struct ContentView_Previews: PreviewProvider {
	static var previews: some View {
		ContentView()
	}
}
