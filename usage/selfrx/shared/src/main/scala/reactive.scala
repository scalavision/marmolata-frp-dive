package com.sap.marmolata

package object react extends com.sap.marmolata.react.api.ReactiveObject {
  val library: com.sap.marmolata.react.api.ReactiveDeclaration = new com.sap.marmolata.react.impls.selfrx.SelfRxImpl with com.sap.marmolata.react.api.ReactiveDeclaration
}