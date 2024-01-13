/***************************************************************************************
* Copyright (c) 2024-2026 YangYang, https://github.com/yelbuod
*
* XiangShan is licensed under Mulan PSL v2.
* You can use this software according to the terms and conditions of the Mulan PSL v2.
* You may obtain a copy of Mulan PSL v2 at:
*          http://license.coscl.org.cn/MulanPSL2
*
* THIS SOFTWARE IS PROVIDED ON AN "AS IS" BASIS, WITHOUT WARRANTIES OF ANY KIND,
* EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO NON-INFRINGEMENT,
* MERCHANTABILITY OR FIT FOR A PARTICULAR PURPOSE.
*
* See the Mulan PSL v2 for more details.
***************************************************************************************/

import mill._
import scalalib._

// extends this trait to use XiangShan in other projects
trait XiangShanModule extends ScalaModule {

  def rocketModule: ScalaModule

  def difftestModule: ScalaModule

  def huancunModule: ScalaModule

  def coupledL2Module: ScalaModule

  def fudianModule: ScalaModule

  def utilityModule: ScalaModule

  override def moduleDeps = super.moduleDeps ++ Seq(
    rocketModule,
    difftestModule,
    huancunModule,
    coupledL2Module,
    fudianModule,
    utilityModule,
  )

}
