//
//  UserObservable.swift
//  iosApp
//
//  Created by 강문수 on 4/5/25.
//  Copyright © 2025 orgName. All rights reserved.
//

import Foundation
import shared
import Combine

@MainActor
class UserObservable: ObservableObject {
    private let useCase = GetUsersUseCase(repository: UserRepositoryImpl(api: UserApi()))

    @Published var users: [User] = []

    func loadUsers() {
        Task {
            self.users = try await useCase.invoke()
        }
    }
}
