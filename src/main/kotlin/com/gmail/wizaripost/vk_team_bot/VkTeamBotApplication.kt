package com.gmail.wizaripost.vk_team_bot

import com.gmail.wizaripost.vk_team_bot.service.VkTeamsBotService
import org.springframework.beans.factory.getBean
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class VkTeamBotApplication

fun main(args: Array<String>) {
//	runApplication<VkTeamBotApplication>(*args)
    val application = runApplication<VkTeamBotApplication>(*args)
//	val sempleStart = application.getBean<SimpleStart>()
//	sempleStart.start()
    val sempleStart = application.getBean<VkTeamsBotService>()
//	sempleStart.send("SS 123")
    sempleStart.send(
        "os-18.10.30 C3-XLV2SC-prod-v166.114-XL2_SP_CONV-20251107-1327.img 0012df60a319 19011906 FA330_Curve_1M_Mech CF-6 /dgt/ram/bin/lib/libGraphicsGL.so : Assimp::BaseImporter::ReadFile(Assimp::Importer*, std::__cxx11::basic_string<char, std::char_traits<char>, std::allocator<char> > const&, Assimp::IOSystem*) /dgt/ram/bin/lib/libGraphicsGL.so : Assimp::Importer::ReadFile(char const*, unsigned int) /dgt/ram/bin/lib/libGraphicsGL.so : Node::LoadFromFile(std::__cxx11::basic_string<char, std::char_traits<char>, std::allocator<char> > const&, Node**) /dgt/ram/bin/lib/libGraphicsGL.so : LoadSceneFromFile() ../lib/libGameSnowKingdom_SP_conv.so : MosDynamicLinkFrame::Initialize(SceneLib::SceneMgr&, NGL::ResourcesMgr&) ../lib/libGameSnowKingdom_SP_conv.so : SceneLib::SceneMgr::LoadObject(pugi::xml_node const&, MOS::XMLMgr*, NGL::ResourcesMgr*) ../lib/libGameSnowKingdom_SP_conv.so : SceneLib::SceneMgr::LoadObject(pugi::xml_node const&, MOS::XMLMgr*, NGL::ResourcesMgr*) ../lib/libGameSnowKingdom_SP_conv.so : SceneLib::SceneMgr::LoadObject(char const*, MOS::XMLMgr*, NGL::ResourcesMgr*) ../lib/libGameSnowKingdom_SP_conv.so : SceneLib::SceneMgr::LoadObject(pugi::xml_node const&, MOS::XMLMgr*, NGL::ResourcesMgr*) ../lib/libGameSnowKingdom_SP_conv.so : SceneLib::SceneMgr::LoadObject(char const*, MOS::XMLMgr*, NGL::ResourcesMgr*) ../lib/libGameSnowKingdom_SP_conv.so : SceneLib::SceneMgr::Load(char const*, MOS::XMLMgr*, NGL::ResourcesMgr*) ../lib/libGameSnowKingdom_SP_conv.so : NGLSlot::GameBase::LoadResources(NGL::ResourcesMgr*)\n" +
                "../lib/libGameSnowKingdom_SP_conv.so : DynamicLink::GameBase::LoadResources(NGL::ResourcesMgr*)\n" +
                "../lib/libGameSnowKingdom_SP_conv.so : SnowKingdom::Main::LoadResources(NGL::ResourcesMgr*)\n" +
                "/dgt/ram/bin/lib/libOldSystem.so.1 : GameProxy::LoadGame()\n" +
                "/dgt/ram/bin/lib/libOldSystem.so.1 : GameProxy::Load()\n" +
                "/dgt/ram/bin/lib/libOldSystem.so.1 : GameProxy::OnLoad()\n" +
                "/dgt/ram/bin/lib/libOldSystem.so.1 : LoadNext()\n" +
                "/dgt/ram/bin/lib/libOldSystem.so.1 : OnTimer(int)\n" +
                "/dgt/ram/bin/lib/libOldSystem.so.1 : OldSystem_BeginDraw() ./Launcher : main()\n" +
                "/lib/x86_64-linux-gnu/libc.so.6 : __libc_start_main()\n" +
                "/dgt/ram/bin/Desk-games-prj/Desk-games: line 780: 19945 Segmentation fault      ./Launcher -fullscreen -machine_config_file_direct \"\${conf_file}\" \$extra_options\n" +
                "2025.11.07 - Xtension Link Volume 2 Spain Converter-v166.114-108141 BUILD_TAG : 'jenkins-TEST2-Build-v3-4558'\n" +
                "STRUCTURE_VERSION : 'v1.2'\n" +
                "SYSTEM_BRANCH : 'xl-spain25-converter-stage7'\n" +
                "GAME_BRANCH : 'xl-spain25-converter-stage7'\n" +
                "AUX_BRANCH : 'xl-spain25-converter-stage7'\n" +
                "GRAPHICS_BRANCH : 'xl-spain25-converter-stage7'\n" +
                "MATH_BRANCH : 'xl-spain25-converter-stage7'\n" +
                "=============\n" +
                "error loading Data/Games/SnowKingdom_SP_conv/flip_screen/object.xml\n" +
                "[MOS-XML] error creating object for field data error loading %BALL_BGR_INACTIVE% [MOS-XML] error creating object for field data error loading %BALL_BGR_INACTIVE% [MOS-XML] error creating object for field data error loading %BALL_BGR_INACTIVE% [MOS-XML] error creating object for field data error loading %BALL_BGR_INACTIVE% [MOS-XML] error creating object for field data error loading %BALL_BGR_INACTIVE% [MOS-XML] error creating object for field data error loading %BALL_BGR_INACTIVE% [MOS-XML] error creating object for field data error loading %BALL_BGR_INACTIVE% [MOS-XML] error creating object for field data error loading %BALL_BGR_INACTIVE% ERROR!  FILE NOT FOUND Data/NGLLib1/vip_control_panel/Panther_Mech/constants.xml\n" +
                "error loading Data/Games/SnowKingdom_SP_con\n" +
                "+++++++++++++++++++++++++++++++++++++++++++\n" +
                "os-18.10.30 C3-XLV2SC-prod-v166.114-XL2_SP_CONV-20251107-1327.img 0012df60a319 19011906 FA330_Curve_1M_Mech CF-6 /dgt/ram/bin/lib/libGraphicsGL.so : Assimp::BaseImporter::ReadFile(Assimp::Importer*, std::__cxx11::basic_string<char, std::char_traits<char>, std::allocator<char> > const&, Assimp::IOSystem*) /dgt/ram/bin/lib/libGraphicsGL.so : Assimp::Importer::ReadFile(char const*, unsigned int) /dgt/ram/bin/lib/libGraphicsGL.so : Node::LoadFromFile(std::__cxx11::basic_string<char, std::char_traits<char>, std::allocator<char> > const&, Node**) /dgt/ram/bin/lib/libGraphicsGL.so : LoadSceneFromFile() ../lib/libGameSnowKingdom_SP_conv.so : MosDynamicLinkFrame::Initialize(SceneLib::SceneMgr&, NGL::ResourcesMgr&) ../lib/libGameSnowKingdom_SP_conv.so : SceneLib::SceneMgr::LoadObject(pugi::xml_node const&, MOS::XMLMgr*, NGL::ResourcesMgr*) ../lib/libGameSnowKingdom_SP_conv.so : SceneLib::SceneMgr::LoadObject(pugi::xml_node const&, MOS::XMLMgr*, NGL::ResourcesMgr*) ../lib/libGameSnowKingdom_SP_conv.so : SceneLib::SceneMgr::LoadObject(char const*, MOS::XMLMgr*, NGL::ResourcesMgr*) ../lib/libGameSnowKingdom_SP_conv.so : SceneLib::SceneMgr::LoadObject(pugi::xml_node const&, MOS::XMLMgr*, NGL::ResourcesMgr*) ../lib/libGameSnowKingdom_SP_conv.so : SceneLib::SceneMgr::LoadObject(char const*, MOS::XMLMgr*, NGL::ResourcesMgr*) ../lib/libGameSnowKingdom_SP_conv.so : SceneLib::SceneMgr::Load(char const*, MOS::XMLMgr*, NGL::ResourcesMgr*) ../lib/libGameSnowKingdom_SP_conv.so : NGLSlot::GameBase::LoadResources(NGL::ResourcesMgr*)\n" +
                "../lib/libGameSnowKingdom_SP_conv.so : DynamicLink::GameBase::LoadResources(NGL::ResourcesMgr*)\n" +
                "../lib/libGameSnowKingdom_SP_conv.so : SnowKingdom::Main::LoadResources(NGL::ResourcesMgr*)\n" +
                "/dgt/ram/bin/lib/libOldSystem.so.1 : GameProxy::LoadGame()\n" +
                "/dgt/ram/bin/lib/libOldSystem.so.1 : GameProxy::Load()\n" +
                "/dgt/ram/bin/lib/libOldSystem.so.1 : GameProxy::OnLoad()\n" +
                "/dgt/ram/bin/lib/libOldSystem.so.1 : LoadNext()\n" +
                "/dgt/ram/bin/lib/libOldSystem.so.1 : OnTimer(int)\n" +
                "/dgt/ram/bin/lib/libOldSystem.so.1 : OldSystem_BeginDraw() ./Launcher : main()\n" +
                "/lib/x86_64-linux-gnu/libc.so.6 : __libc_start_main()\n" +
                "/dgt/ram/bin/Desk-games-prj/Desk-games: line 780: 19945 Segmentation fault      ./Launcher -fullscreen -machine_config_file_direct \"\${conf_file}\" \$extra_options\n" +
                "2025.11.07 - Xtension Link Volume 2 Spain Converter-v166.114-108141 BUILD_TAG : 'jenkins-TEST2-Build-v3-4558'\n" +
                "STRUCTURE_VERSION : 'v1.2'\n" +
                "SYSTEM_BRANCH : 'xl-spain25-converter-stage7'\n" +
                "GAME_BRANCH : 'xl-spain25-converter-stage7'\n" +
                "AUX_BRANCH : 'xl-spain25-converter-stage7'\n" +
                "GRAPHICS_BRANCH : 'xl-spain25-converter-stage7'\n" +
                "MATH_BRANCH : 'xl-spain25-converter-stage7'\n" +
                "=============\n" +
                "error loading Data/Games/SnowKingdom_SP_conv/flip_screen/object.xml\n" +
                "[MOS-XML] error creating object for field data error loading %BALL_BGR_INACTIVE% [MOS-XML] error creating object for field data error loading %BALL_BGR_INACTIVE% [MOS-XML] error creating object for field data error loading %BALL_BGR_INACTIVE% [MOS-XML] error creating object for field data error loading %BALL_BGR_INACTIVE% [MOS-XML] error creating object for field data error loading %BALL_BGR_INACTIVE% [MOS-XML] error creating object for field data error loading %BALL_BGR_INACTIVE% [MOS-XML] error creating object for field data error loading %BALL_BGR_INACTIVE% [MOS-XML] error creating object for field data error loading %BALL_BGR_INACTIVE% ERROR!  FILE NOT FOUND Data/NGLLib1/vip_control_panel/Panther_Mech/constants.xml\n" +
                "error loading Data/Games/SnowKingdom_SP_con\n" +
                "+++++++++++++++++++++++++++++++++++++++++++\n" +
                "os-18.10.30 C3-XLV2SC-prod-v166.114-XL2_SP_CONV-20251107-1327.img 0012df60a319 19011906 FA330_Curve_1M_Mech CF-6 /dgt/ram/bin/lib/libGraphicsGL.so : Assimp::BaseImporter::ReadFile(Assimp::Importer*, std::__cxx11::basic_string<char, std::char_traits<char>, std::allocator<char> > const&, Assimp::IOSystem*) /dgt/ram/bin/lib/libGraphicsGL.so : Assimp::Importer::ReadFile(char const*, unsigned int) /dgt/ram/bin/lib/libGraphicsGL.so : Node::LoadFromFile(std::__cxx11::basic_string<char, std::char_traits<char>, std::allocator<char> > const&, Node**) /dgt/ram/bin/lib/libGraphicsGL.so : LoadSceneFromFile() ../lib/libGameSnowKingdom_SP_conv.so : MosDynamicLinkFrame::Initialize(SceneLib::SceneMgr&, NGL::ResourcesMgr&) ../lib/libGameSnowKingdom_SP_conv.so : SceneLib::SceneMgr::LoadObject(pugi::xml_node const&, MOS::XMLMgr*, NGL::ResourcesMgr*) ../lib/libGameSnowKingdom_SP_conv.so : SceneLib::SceneMgr::LoadObject(pugi::xml_node const&, MOS::XMLMgr*, NGL::ResourcesMgr*) ../lib/libGameSnowKingdom_SP_conv.so : SceneLib::SceneMgr::LoadObject(char const*, MOS::XMLMgr*, NGL::ResourcesMgr*) ../lib/libGameSnowKingdom_SP_conv.so : SceneLib::SceneMgr::LoadObject(pugi::xml_node const&, MOS::XMLMgr*, NGL::ResourcesMgr*) ../lib/libGameSnowKingdom_SP_conv.so : SceneLib::SceneMgr::LoadObject(char const*, MOS::XMLMgr*, NGL::ResourcesMgr*) ../lib/libGameSnowKingdom_SP_conv.so : SceneLib::SceneMgr::Load(char const*, MOS::XMLMgr*, NGL::ResourcesMgr*) ../lib/libGameSnowKingdom_SP_conv.so : NGLSlot::GameBase::LoadResources(NGL::ResourcesMgr*)\n" +
                "../lib/libGameSnowKingdom_SP_conv.so : DynamicLink::GameBase::LoadResources(NGL::ResourcesMgr*)\n" +
                "../lib/libGameSnowKingdom_SP_conv.so : SnowKingdom::Main::LoadResources(NGL::ResourcesMgr*)\n" +
                "/dgt/ram/bin/lib/libOldSystem.so.1 : GameProxy::LoadGame()\n" +
                "/dgt/ram/bin/lib/libOldSystem.so.1 : GameProxy::Load()\n" +
                "/dgt/ram/bin/lib/libOldSystem.so.1 : GameProxy::OnLoad()\n" +
                "/dgt/ram/bin/lib/libOldSystem.so.1 : LoadNext()\n" +
                "/dgt/ram/bin/lib/libOldSystem.so.1 : OnTimer(int)\n" +
                "/dgt/ram/bin/lib/libOldSystem.so.1 : OldSystem_BeginDraw() ./Launcher : main()\n" +
                "/lib/x86_64-linux-gnu/libc.so.6 : __libc_start_main()\n" +
                "/dgt/ram/bin/Desk-games-prj/Desk-games: line 780: 19945 Segmentation fault      ./Launcher -fullscreen -machine_config_file_direct \"\${conf_file}\" \$extra_options\n" +
                "2025.11.07 - Xtension Link Volume 2 Spain Converter-v166.114-108141 BUILD_TAG : 'jenkins-TEST2-Build-v3-4558'\n" +
                "STRUCTURE_VERSION : 'v1.2'\n" +
                "SYSTEM_BRANCH : 'xl-spain25-converter-stage7'\n" +
                "GAME_BRANCH : 'xl-spain25-converter-stage7'\n" +
                "AUX_BRANCH : 'xl-spain25-converter-stage7'\n" +
                "GRAPHICS_BRANCH : 'xl-spain25-converter-stage7'\n" +
                "MATH_BRANCH : 'xl-spain25-converter-stage7'\n" +
                "=============\n" +
                "error loading Data/Games/SnowKingdom_SP_conv/flip_screen/object.xml\n" +
                "[MOS-XML] error creating object for field data error loading %BALL_BGR_INACTIVE% [MOS-XML] error creating object for field data error loading %BALL_BGR_INACTIVE% [MOS-XML] error creating object for field data error loading %BALL_BGR_INACTIVE% [MOS-XML] error creating object for field data error loading %BALL_BGR_INACTIVE% [MOS-XML] error creating object for field data error loading %BALL_BGR_INACTIVE% [MOS-XML] error creating object for field data error loading %BALL_BGR_INACTIVE% [MOS-XML] error creating object for field data error loading %BALL_BGR_INACTIVE% [MOS-XML] error creating object for field data error loading %BALL_BGR_INACTIVE% ERROR!  FILE NOT FOUND Data/NGLLib1/vip_control_panel/Panther_Mech/constants.xml\n" +
                "error loading Data/Games/SnowKingdom_SP_con\n" +
                "+++++++++++++++++++++++++++++++++++++++++++\n" +
                "os-18.10.30 C3-XLV2SC-prod-v166.114-XL2_SP_CONV-20251107-1327.img 0012df60a319 19011906 FA330_Curve_1M_Mech CF-6 /dgt/ram/bin/lib/libGraphicsGL.so : Assimp::BaseImporter::ReadFile(Assimp::Importer*, std::__cxx11::basic_string<char, std::char_traits<char>, std::allocator<char> > const&, Assimp::IOSystem*) /dgt/ram/bin/lib/libGraphicsGL.so : Assimp::Importer::ReadFile(char const*, unsigned int) /dgt/ram/bin/lib/libGraphicsGL.so : Node::LoadFromFile(std::__cxx11::basic_string<char, std::char_traits<char>, std::allocator<char> > const&, Node**) /dgt/ram/bin/lib/libGraphicsGL.so : LoadSceneFromFile() ../lib/libGameSnowKingdom_SP_conv.so : MosDynamicLinkFrame::Initialize(SceneLib::SceneMgr&, NGL::ResourcesMgr&) ../lib/libGameSnowKingdom_SP_conv.so : SceneLib::SceneMgr::LoadObject(pugi::xml_node const&, MOS::XMLMgr*, NGL::ResourcesMgr*) ../lib/libGameSnowKingdom_SP_conv.so : SceneLib::SceneMgr::LoadObject(pugi::xml_node const&, MOS::XMLMgr*, NGL::ResourcesMgr*) ../lib/libGameSnowKingdom_SP_conv.so : SceneLib::SceneMgr::LoadObject(char const*, MOS::XMLMgr*, NGL::ResourcesMgr*) ../lib/libGameSnowKingdom_SP_conv.so : SceneLib::SceneMgr::LoadObject(pugi::xml_node const&, MOS::XMLMgr*, NGL::ResourcesMgr*) ../lib/libGameSnowKingdom_SP_conv.so : SceneLib::SceneMgr::LoadObject(char const*, MOS::XMLMgr*, NGL::ResourcesMgr*) ../lib/libGameSnowKingdom_SP_conv.so : SceneLib::SceneMgr::Load(char const*, MOS::XMLMgr*, NGL::ResourcesMgr*) ../lib/libGameSnowKingdom_SP_conv.so : NGLSlot::GameBase::LoadResources(NGL::ResourcesMgr*)\n" +
                "../lib/libGameSnowKingdom_SP_conv.so : DynamicLink::GameBase::LoadResources(NGL::ResourcesMgr*)\n" +
                "../lib/libGameSnowKingdom_SP_conv.so : SnowKingdom::Main::LoadResources(NGL::ResourcesMgr*)\n" +
                "/dgt/ram/bin/lib/libOldSystem.so.1 : GameProxy::LoadGame()\n" +
                "/dgt/ram/bin/lib/libOldSystem.so.1 : GameProxy::Load()\n" +
                "/dgt/ram/bin/lib/libOldSystem.so.1 : GameProxy::OnLoad()\n" +
                "/dgt/ram/bin/lib/libOldSystem.so.1 : LoadNext()\n" +
                "/dgt/ram/bin/lib/libOldSystem.so.1 : OnTimer(int)\n" +
                "/dgt/ram/bin/lib/libOldSystem.so.1 : OldSystem_BeginDraw() ./Launcher : main()\n" +
                "/lib/x86_64-linux-gnu/libc.so.6 : __libc_start_main()\n" +
                "/dgt/ram/bin/Desk-games-prj/Desk-games: line 780: 19945 Segmentation fault      ./Launcher -fullscreen -machine_config_file_direct \"\${conf_file}\" \$extra_options\n" +
                "2025.11.07 - Xtension Link Volume 2 Spain Converter-v166.114-108141 BUILD_TAG : 'jenkins-TEST2-Build-v3-4558'\n" +
                "STRUCTURE_VERSION : 'v1.2'\n" +
                "SYSTEM_BRANCH : 'xl-spain25-converter-stage7'\n" +
                "GAME_BRANCH : 'xl-spain25-converter-stage7'\n" +
                "AUX_BRANCH : 'xl-spain25-converter-stage7'\n" +
                "GRAPHICS_BRANCH : 'xl-spain25-converter-stage7'\n" +
                "MATH_BRANCH : 'xl-spain25-converter-stage7'\n" +
                "=============\n" +
                "error loading Data/Games/SnowKingdom_SP_conv/flip_screen/object.xml\n" +
                "[MOS-XML] error creating object for field data error loading %BALL_BGR_INACTIVE% [MOS-XML] error creating object for field data error loading %BALL_BGR_INACTIVE% [MOS-XML] error creating object for field data error loading %BALL_BGR_INACTIVE% [MOS-XML] error creating object for field data error loading %BALL_BGR_INACTIVE% [MOS-XML] error creating object for field data error loading %BALL_BGR_INACTIVE% [MOS-XML] error creating object for field data error loading %BALL_BGR_INACTIVE% [MOS-XML] error creating object for field data error loading %BALL_BGR_INACTIVE% [MOS-XML] error creating object for field data error loading %BALL_BGR_INACTIVE% ERROR!  FILE NOT FOUND Data/NGLLib1/vip_control_panel/Panther_Mech/constants.xml\n" +
                "error loading Data/Games/SnowKingdom_SP_con"+
                "os-18.10.30 C3-XLV2SC-prod-v166.114-XL2_SP_CONV-20251107-1327.img 0012df60a319 19011906 FA330_Curve_1M_Mech CF-6 /dgt/ram/bin/lib/libGraphicsGL.so : Assimp::BaseImporter::ReadFile(Assimp::Importer*, std::__cxx11::basic_string<char, std::char_traits<char>, std::allocator<char> > const&, Assimp::IOSystem*) /dgt/ram/bin/lib/libGraphicsGL.so : Assimp::Importer::ReadFile(char const*, unsigned int) /dgt/ram/bin/lib/libGraphicsGL.so : Node::LoadFromFile(std::__cxx11::basic_string<char, std::char_traits<char>, std::allocator<char> > const&, Node**) /dgt/ram/bin/lib/libGraphicsGL.so : LoadSceneFromFile() ../lib/libGameSnowKingdom_SP_conv.so : MosDynamicLinkFrame::Initialize(SceneLib::SceneMgr&, NGL::ResourcesMgr&) ../lib/libGameSnowKingdom_SP_conv.so : SceneLib::SceneMgr::LoadObject(pugi::xml_node const&, MOS::XMLMgr*, NGL::ResourcesMgr*) ../lib/libGameSnowKingdom_SP_conv.so : SceneLib::SceneMgr::LoadObject(pugi::xml_node const&, MOS::XMLMgr*, NGL::ResourcesMgr*) ../lib/libGameSnowKingdom_SP_conv.so : SceneLib::SceneMgr::LoadObject(char const*, MOS::XMLMgr*, NGL::ResourcesMgr*) ../lib/libGameSnowKingdom_SP_conv.so : SceneLib::SceneMgr::LoadObject(pugi::xml_node const&, MOS::XMLMgr*, NGL::ResourcesMgr*) ../lib/libGameSnowKingdom_SP_conv.so : SceneLib::SceneMgr::LoadObject(char const*, MOS::XMLMgr*, NGL::ResourcesMgr*) ../lib/libGameSnowKingdom_SP_conv.so : SceneLib::SceneMgr::Load(char const*, MOS::XMLMgr*, NGL::ResourcesMgr*) ../lib/libGameSnowKingdom_SP_conv.so : NGLSlot::GameBase::LoadResources(NGL::ResourcesMgr*)\n" +
                "../lib/libGameSnowKingdom_SP_conv.so : DynamicLink::GameBase::LoadResources(NGL::ResourcesMgr*)\n" +
                "../lib/libGameSnowKingdom_SP_conv.so : SnowKingdom::Main::LoadResources(NGL::ResourcesMgr*)\n" +
                "/dgt/ram/bin/lib/libOldSystem.so.1 : GameProxy::LoadGame()\n" +
                "/dgt/ram/bin/lib/libOldSystem.so.1 : GameProxy::Load()\n" +
                "/dgt/ram/bin/lib/libOldSystem.so.1 : GameProxy::OnLoad()\n" +
                "/dgt/ram/bin/lib/libOldSystem.so.1 : LoadNext()\n" +
                "/dgt/ram/bin/lib/libOldSystem.so.1 : OnTimer(int)\n" +
                "/dgt/ram/bin/lib/libOldSystem.so.1 : OldSystem_BeginDraw() ./Launcher : main()\n" +
                "/lib/x86_64-linux-gnu/libc.so.6 : __libc_start_main()\n" +
                "/dgt/ram/bin/Desk-games-prj/Desk-games: line 780: 19945 Segmentation fault      ./Launcher -fullscreen -machine_config_file_direct \"\${conf_file}\" \$extra_options\n" +
                "2025.11.07 - Xtension Link Volume 2 Spain Converter-v166.114-108141 BUILD_TAG : 'jenkins-TEST2-Build-v3-4558'\n" +
                "STRUCTURE_VERSION : 'v1.2'\n" +
                "SYSTEM_BRANCH : 'xl-spain25-converter-stage7'\n" +
                "GAME_BRANCH : 'xl-spain25-converter-stage7'\n" +
                "AUX_BRANCH : 'xl-spain25-converter-stage7'\n" +
                "GRAPHICS_BRANCH : 'xl-spain25-converter-stage7'\n" +
                "MATH_BRANCH : 'xl-spain25-converter-stage7'\n" +
                "=============\n" +
                "error loading Data/Games/SnowKingdom_SP_conv/flip_screen/object.xml\n" +
                "[MOS-XML] error creating object for field data error loading %BALL_BGR_INACTIVE% [MOS-XML] error creating object for field data error loading %BALL_BGR_INACTIVE% [MOS-XML] error creating object for field data error loading %BALL_BGR_INACTIVE% [MOS-XML] error creating object for field data error loading %BALL_BGR_INACTIVE% [MOS-XML] error creating object for field data error loading %BALL_BGR_INACTIVE% [MOS-XML] error creating object for field data error loading %BALL_BGR_INACTIVE% [MOS-XML] error creating object for field data error loading %BALL_BGR_INACTIVE% [MOS-XML] error creating object for field data error loading %BALL_BGR_INACTIVE% ERROR!  FILE NOT FOUND Data/NGLLib1/vip_control_panel/Panther_Mech/constants.xml\n" +
                "error loading Data/Games/SnowKingdom_SP_con\n" +
                "+++++++++++++++++++++++++++++++++++++++++++\n" +
                "os-18.10.30 C3-XLV2SC-prod-v166.114-XL2_SP_CONV-20251107-1327.img 0012df60a319 19011906 FA330_Curve_1M_Mech CF-6 /dgt/ram/bin/lib/libGraphicsGL.so : Assimp::BaseImporter::ReadFile(Assimp::Importer*, std::__cxx11::basic_string<char, std::char_traits<char>, std::allocator<char> > const&, Assimp::IOSystem*) /dgt/ram/bin/lib/libGraphicsGL.so : Assimp::Importer::ReadFile(char const*, unsigned int) /dgt/ram/bin/lib/libGraphicsGL.so : Node::LoadFromFile(std::__cxx11::basic_string<char, std::char_traits<char>, std::allocator<char> > const&, Node**) /dgt/ram/bin/lib/libGraphicsGL.so : LoadSceneFromFile() ../lib/libGameSnowKingdom_SP_conv.so : MosDynamicLinkFrame::Initialize(SceneLib::SceneMgr&, NGL::ResourcesMgr&) ../lib/libGameSnowKingdom_SP_conv.so : SceneLib::SceneMgr::LoadObject(pugi::xml_node const&, MOS::XMLMgr*, NGL::ResourcesMgr*) ../lib/libGameSnowKingdom_SP_conv.so : SceneLib::SceneMgr::LoadObject(pugi::xml_node const&, MOS::XMLMgr*, NGL::ResourcesMgr*) ../lib/libGameSnowKingdom_SP_conv.so : SceneLib::SceneMgr::LoadObject(char const*, MOS::XMLMgr*, NGL::ResourcesMgr*) ../lib/libGameSnowKingdom_SP_conv.so : SceneLib::SceneMgr::LoadObject(pugi::xml_node const&, MOS::XMLMgr*, NGL::ResourcesMgr*) ../lib/libGameSnowKingdom_SP_conv.so : SceneLib::SceneMgr::LoadObject(char const*, MOS::XMLMgr*, NGL::ResourcesMgr*) ../lib/libGameSnowKingdom_SP_conv.so : SceneLib::SceneMgr::Load(char const*, MOS::XMLMgr*, NGL::ResourcesMgr*) ../lib/libGameSnowKingdom_SP_conv.so : NGLSlot::GameBase::LoadResources(NGL::ResourcesMgr*)\n" +
                "../lib/libGameSnowKingdom_SP_conv.so : DynamicLink::GameBase::LoadResources(NGL::ResourcesMgr*)\n" +
                "../lib/libGameSnowKingdom_SP_conv.so : SnowKingdom::Main::LoadResources(NGL::ResourcesMgr*)\n" +
                "/dgt/ram/bin/lib/libOldSystem.so.1 : GameProxy::LoadGame()\n" +
                "/dgt/ram/bin/lib/libOldSystem.so.1 : GameProxy::Load()\n" +
                "/dgt/ram/bin/lib/libOldSystem.so.1 : GameProxy::OnLoad()\n" +
                "/dgt/ram/bin/lib/libOldSystem.so.1 : LoadNext()\n" +
                "/dgt/ram/bin/lib/libOldSystem.so.1 : OnTimer(int)\n" +
                "/dgt/ram/bin/lib/libOldSystem.so.1 : OldSystem_BeginDraw() ./Launcher : main()\n" +
                "/lib/x86_64-linux-gnu/libc.so.6 : __libc_start_main()\n" +
                "/dgt/ram/bin/Desk-games-prj/Desk-games: line 780: 19945 Segmentation fault      ./Launcher -fullscreen -machine_config_file_direct \"\${conf_file}\" \$extra_options\n" +
                "2025.11.07 - Xtension Link Volume 2 Spain Converter-v166.114-108141 BUILD_TAG : 'jenkins-TEST2-Build-v3-4558'\n" +
                "STRUCTURE_VERSION : 'v1.2'\n" +
                "SYSTEM_BRANCH : 'xl-spain25-converter-stage7'\n" +
                "GAME_BRANCH : 'xl-spain25-converter-stage7'\n" +
                "AUX_BRANCH : 'xl-spain25-converter-stage7'\n" +
                "GRAPHICS_BRANCH : 'xl-spain25-converter-stage7'\n" +
                "MATH_BRANCH : 'xl-spain25-converter-stage7'\n" +
                "=============\n" +
                "error loading Data/Games/SnowKingdom_SP_conv/flip_screen/object.xml\n" +
                "[MOS-XML] error creating object for field data error loading %BALL_BGR_INACTIVE% [MOS-XML] error creating object for field data error loading %BALL_BGR_INACTIVE% [MOS-XML] error creating object for field data error loading %BALL_BGR_INACTIVE% [MOS-XML] error creating object for field data error loading %BALL_BGR_INACTIVE% [MOS-XML] error creating object for field data error loading %BALL_BGR_INACTIVE% [MOS-XML] error creating object for field data error loading %BALL_BGR_INACTIVE% [MOS-XML] error creating object for field data error loading %BALL_BGR_INACTIVE% [MOS-XML] error creating object for field data error loading %BALL_BGR_INACTIVE% ERROR!  FILE NOT FOUND Data/NGLLib1/vip_control_panel/Panther_Mech/constants.xml\n" +
                "error loading Data/Games/SnowKingdom_SP_con\n" +
                "+++++++++++++++++++++++++++++++++++++++++++\n" +
                "os-18.10.30 C3-XLV2SC-prod-v166.114-XL2_SP_CONV-20251107-1327.img 0012df60a319 19011906 FA330_Curve_1M_Mech CF-6 /dgt/ram/bin/lib/libGraphicsGL.so : Assimp::BaseImporter::ReadFile(Assimp::Importer*, std::__cxx11::basic_string<char, std::char_traits<char>, std::allocator<char> > const&, Assimp::IOSystem*) /dgt/ram/bin/lib/libGraphicsGL.so : Assimp::Importer::ReadFile(char const*, unsigned int) /dgt/ram/bin/lib/libGraphicsGL.so : Node::LoadFromFile(std::__cxx11::basic_string<char, std::char_traits<char>, std::allocator<char> > const&, Node**) /dgt/ram/bin/lib/libGraphicsGL.so : LoadSceneFromFile() ../lib/libGameSnowKingdom_SP_conv.so : MosDynamicLinkFrame::Initialize(SceneLib::SceneMgr&, NGL::ResourcesMgr&) ../lib/libGameSnowKingdom_SP_conv.so : SceneLib::SceneMgr::LoadObject(pugi::xml_node const&, MOS::XMLMgr*, NGL::ResourcesMgr*) ../lib/libGameSnowKingdom_SP_conv.so : SceneLib::SceneMgr::LoadObject(pugi::xml_node const&, MOS::XMLMgr*, NGL::ResourcesMgr*) ../lib/libGameSnowKingdom_SP_conv.so : SceneLib::SceneMgr::LoadObject(char const*, MOS::XMLMgr*, NGL::ResourcesMgr*) ../lib/libGameSnowKingdom_SP_conv.so : SceneLib::SceneMgr::LoadObject(pugi::xml_node const&, MOS::XMLMgr*, NGL::ResourcesMgr*) ../lib/libGameSnowKingdom_SP_conv.so : SceneLib::SceneMgr::LoadObject(char const*, MOS::XMLMgr*, NGL::ResourcesMgr*) ../lib/libGameSnowKingdom_SP_conv.so : SceneLib::SceneMgr::Load(char const*, MOS::XMLMgr*, NGL::ResourcesMgr*) ../lib/libGameSnowKingdom_SP_conv.so : NGLSlot::GameBase::LoadResources(NGL::ResourcesMgr*)\n" +
                "../lib/libGameSnowKingdom_SP_conv.so : DynamicLink::GameBase::LoadResources(NGL::ResourcesMgr*)\n" +
                "../lib/libGameSnowKingdom_SP_conv.so : SnowKingdom::Main::LoadResources(NGL::ResourcesMgr*)\n" +
                "/dgt/ram/bin/lib/libOldSystem.so.1 : GameProxy::LoadGame()\n" +
                "/dgt/ram/bin/lib/libOldSystem.so.1 : GameProxy::Load()\n" +
                "/dgt/ram/bin/lib/libOldSystem.so.1 : GameProxy::OnLoad()\n" +
                "/dgt/ram/bin/lib/libOldSystem.so.1 : LoadNext()\n" +
                "/dgt/ram/bin/lib/libOldSystem.so.1 : OnTimer(int)\n" +
                "/dgt/ram/bin/lib/libOldSystem.so.1 : OldSystem_BeginDraw() ./Launcher : main()\n" +
                "/lib/x86_64-linux-gnu/libc.so.6 : __libc_start_main()\n" +
                "/dgt/ram/bin/Desk-games-prj/Desk-games: line 780: 19945 Segmentation fault      ./Launcher -fullscreen -machine_config_file_direct \"\${conf_file}\" \$extra_options\n" +
                "2025.11.07 - Xtension Link Volume 2 Spain Converter-v166.114-108141 BUILD_TAG : 'jenkins-TEST2-Build-v3-4558'\n" +
                "STRUCTURE_VERSION : 'v1.2'\n" +
                "SYSTEM_BRANCH : 'xl-spain25-converter-stage7'\n" +
                "GAME_BRANCH : 'xl-spain25-converter-stage7'\n" +
                "AUX_BRANCH : 'xl-spain25-converter-stage7'\n" +
                "GRAPHICS_BRANCH : 'xl-spain25-converter-stage7'\n" +
                "MATH_BRANCH : 'xl-spain25-converter-stage7'\n" +
                "=============\n" +
                "error loading Data/Games/SnowKingdom_SP_conv/flip_screen/object.xml\n" +
                "[MOS-XML] error creating object for field data error loading %BALL_BGR_INACTIVE% [MOS-XML] error creating object for field data error loading %BALL_BGR_INACTIVE% [MOS-XML] error creating object for field data error loading %BALL_BGR_INACTIVE% [MOS-XML] error creating object for field data error loading %BALL_BGR_INACTIVE% [MOS-XML] error creating object for field data error loading %BALL_BGR_INACTIVE% [MOS-XML] error creating object for field data error loading %BALL_BGR_INACTIVE% [MOS-XML] error creating object for field data error loading %BALL_BGR_INACTIVE% [MOS-XML] error creating object for field data error loading %BALL_BGR_INACTIVE% ERROR!  FILE NOT FOUND Data/NGLLib1/vip_control_panel/Panther_Mech/constants.xml\n" +
                "error loading Data/Games/SnowKingdom_SP_con\n" +
                "+++++++++++++++++++++++++++++++++++++++++++\n" +
                "os-18.10.30 C3-XLV2SC-prod-v166.114-XL2_SP_CONV-20251107-1327.img 0012df60a319 19011906 FA330_Curve_1M_Mech CF-6 /dgt/ram/bin/lib/libGraphicsGL.so : Assimp::BaseImporter::ReadFile(Assimp::Importer*, std::__cxx11::basic_string<char, std::char_traits<char>, std::allocator<char> > const&, Assimp::IOSystem*) /dgt/ram/bin/lib/libGraphicsGL.so : Assimp::Importer::ReadFile(char const*, unsigned int) /dgt/ram/bin/lib/libGraphicsGL.so : Node::LoadFromFile(std::__cxx11::basic_string<char, std::char_traits<char>, std::allocator<char> > const&, Node**) /dgt/ram/bin/lib/libGraphicsGL.so : LoadSceneFromFile() ../lib/libGameSnowKingdom_SP_conv.so : MosDynamicLinkFrame::Initialize(SceneLib::SceneMgr&, NGL::ResourcesMgr&) ../lib/libGameSnowKingdom_SP_conv.so : SceneLib::SceneMgr::LoadObject(pugi::xml_node const&, MOS::XMLMgr*, NGL::ResourcesMgr*) ../lib/libGameSnowKingdom_SP_conv.so : SceneLib::SceneMgr::LoadObject(pugi::xml_node const&, MOS::XMLMgr*, NGL::ResourcesMgr*) ../lib/libGameSnowKingdom_SP_conv.so : SceneLib::SceneMgr::LoadObject(char const*, MOS::XMLMgr*, NGL::ResourcesMgr*) ../lib/libGameSnowKingdom_SP_conv.so : SceneLib::SceneMgr::LoadObject(pugi::xml_node const&, MOS::XMLMgr*, NGL::ResourcesMgr*) ../lib/libGameSnowKingdom_SP_conv.so : SceneLib::SceneMgr::LoadObject(char const*, MOS::XMLMgr*, NGL::ResourcesMgr*) ../lib/libGameSnowKingdom_SP_conv.so : SceneLib::SceneMgr::Load(char const*, MOS::XMLMgr*, NGL::ResourcesMgr*) ../lib/libGameSnowKingdom_SP_conv.so : NGLSlot::GameBase::LoadResources(NGL::ResourcesMgr*)\n" +
                "../lib/libGameSnowKingdom_SP_conv.so : DynamicLink::GameBase::LoadResources(NGL::ResourcesMgr*)\n" +
                "../lib/libGameSnowKingdom_SP_conv.so : SnowKingdom::Main::LoadResources(NGL::ResourcesMgr*)\n" +
                "/dgt/ram/bin/lib/libOldSystem.so.1 : GameProxy::LoadGame()\n" +
                "/dgt/ram/bin/lib/libOldSystem.so.1 : GameProxy::Load()\n" +
                "/dgt/ram/bin/lib/libOldSystem.so.1 : GameProxy::OnLoad()\n" +
                "/dgt/ram/bin/lib/libOldSystem.so.1 : LoadNext()\n" +
                "/dgt/ram/bin/lib/libOldSystem.so.1 : OnTimer(int)\n" +
                "/dgt/ram/bin/lib/libOldSystem.so.1 : OldSystem_BeginDraw() ./Launcher : main()\n" +
                "/lib/x86_64-linux-gnu/libc.so.6 : __libc_start_main()\n" +
                "/dgt/ram/bin/Desk-games-prj/Desk-games: line 780: 19945 Segmentation fault      ./Launcher -fullscreen -machine_config_file_direct \"\${conf_file}\" \$extra_options\n" +
                "2025.11.07 - Xtension Link Volume 2 Spain Converter-v166.114-108141 BUILD_TAG : 'jenkins-TEST2-Build-v3-4558'\n" +
                "STRUCTURE_VERSION : 'v1.2'\n" +
                "SYSTEM_BRANCH : 'xl-spain25-converter-stage7'\n" +
                "GAME_BRANCH : 'xl-spain25-converter-stage7'\n" +
                "AUX_BRANCH : 'xl-spain25-converter-stage7'\n" +
                "GRAPHICS_BRANCH : 'xl-spain25-converter-stage7'\n" +
                "MATH_BRANCH : 'xl-spain25-converter-stage7'\n" +
                "=============\n" +"os-18.10.30 C3-XLV2SC-prod-v166.114-XL2_SP_CONV-20251107-1327.img 0012df60a319 19011906 FA330_Curve_1M_Mech CF-6 /dgt/ram/bin/lib/libGraphicsGL.so : Assimp::BaseImporter::ReadFile(Assimp::Importer*, std::__cxx11::basic_string<char, std::char_traits<char>, std::allocator<char> > const&, Assimp::IOSystem*) /dgt/ram/bin/lib/libGraphicsGL.so : Assimp::Importer::ReadFile(char const*, unsigned int) /dgt/ram/bin/lib/libGraphicsGL.so : Node::LoadFromFile(std::__cxx11::basic_string<char, std::char_traits<char>, std::allocator<char> > const&, Node**) /dgt/ram/bin/lib/libGraphicsGL.so : LoadSceneFromFile() ../lib/libGameSnowKingdom_SP_conv.so : MosDynamicLinkFrame::Initialize(SceneLib::SceneMgr&, NGL::ResourcesMgr&) ../lib/libGameSnowKingdom_SP_conv.so : SceneLib::SceneMgr::LoadObject(pugi::xml_node const&, MOS::XMLMgr*, NGL::ResourcesMgr*) ../lib/libGameSnowKingdom_SP_conv.so : SceneLib::SceneMgr::LoadObject(pugi::xml_node const&, MOS::XMLMgr*, NGL::ResourcesMgr*) ../lib/libGameSnowKingdom_SP_conv.so : SceneLib::SceneMgr::LoadObject(char const*, MOS::XMLMgr*, NGL::ResourcesMgr*) ../lib/libGameSnowKingdom_SP_conv.so : SceneLib::SceneMgr::LoadObject(pugi::xml_node const&, MOS::XMLMgr*, NGL::ResourcesMgr*) ../lib/libGameSnowKingdom_SP_conv.so : SceneLib::SceneMgr::LoadObject(char const*, MOS::XMLMgr*, NGL::ResourcesMgr*) ../lib/libGameSnowKingdom_SP_conv.so : SceneLib::SceneMgr::Load(char const*, MOS::XMLMgr*, NGL::ResourcesMgr*) ../lib/libGameSnowKingdom_SP_conv.so : NGLSlot::GameBase::LoadResources(NGL::ResourcesMgr*)\n" +
                "../lib/libGameSnowKingdom_SP_conv.so : DynamicLink::GameBase::LoadResources(NGL::ResourcesMgr*)\n" +
                "../lib/libGameSnowKingdom_SP_conv.so : SnowKingdom::Main::LoadResources(NGL::ResourcesMgr*)\n" +
                "/dgt/ram/bin/lib/libOldSystem.so.1 : GameProxy::LoadGame()\n" +
                "/dgt/ram/bin/lib/libOldSystem.so.1 : GameProxy::Load()\n" +
                "/dgt/ram/bin/lib/libOldSystem.so.1 : GameProxy::OnLoad()\n" +
                "/dgt/ram/bin/lib/libOldSystem.so.1 : LoadNext()\n" +
                "/dgt/ram/bin/lib/libOldSystem.so.1 : OnTimer(int)\n" +
                "/dgt/ram/bin/lib/libOldSystem.so.1 : OldSystem_BeginDraw() ./Launcher : main()\n" +
                "/lib/x86_64-linux-gnu/libc.so.6 : __libc_start_main()\n" +
                "/dgt/ram/bin/Desk-games-prj/Desk-games: line 780: 19945 Segmentation fault      ./Launcher -fullscreen -machine_config_file_direct \"\${conf_file}\" \$extra_options\n" +
                "2025.11.07 - Xtension Link Volume 2 Spain Converter-v166.114-108141 BUILD_TAG : 'jenkins-TEST2-Build-v3-4558'\n" +
                "STRUCTURE_VERSION : 'v1.2'\n" +
                "SYSTEM_BRANCH : 'xl-spain25-converter-stage7'\n" +
                "GAME_BRANCH : 'xl-spain25-converter-stage7'\n" +
                "AUX_BRANCH : 'xl-spain25-converter-stage7'\n" +
                "GRAPHICS_BRANCH : 'xl-spain25-converter-stage7'\n" +
                "MATH_BRANCH : 'xl-spain25-converter-stage7'\n" +
                "=============\n" +
                "error loading Data/Games/SnowKingdom_SP_conv/flip_screen/object.xml\n" +
                "[MOS-XML] error creating object for field data error loading %BALL_BGR_INACTIVE% [MOS-XML] error creating object for field data error loading %BALL_BGR_INACTIVE% [MOS-XML] error creating object for field data error loading %BALL_BGR_INACTIVE% [MOS-XML] error creating object for field data error loading %BALL_BGR_INACTIVE% [MOS-XML] error creating object for field data error loading %BALL_BGR_INACTIVE% [MOS-XML] error creating object for field data error loading %BALL_BGR_INACTIVE% [MOS-XML] error creating object for field data error loading %BALL_BGR_INACTIVE% [MOS-XML] error creating object for field data error loading %BALL_BGR_INACTIVE% ERROR!  FILE NOT FOUND Data/NGLLib1/vip_control_panel/Panther_Mech/constants.xml\n" +
                "error loading Data/Games/SnowKingdom_SP_con\n" +
                "+++++++++++++++++++++++++++++++++++++++++++\n" +
                "os-18.10.30 C3-XLV2SC-prod-v166.114-XL2_SP_CONV-20251107-1327.img 0012df60a319 19011906 FA330_Curve_1M_Mech CF-6 /dgt/ram/bin/lib/libGraphicsGL.so : Assimp::BaseImporter::ReadFile(Assimp::Importer*, std::__cxx11::basic_string<char, std::char_traits<char>, std::allocator<char> > const&, Assimp::IOSystem*) /dgt/ram/bin/lib/libGraphicsGL.so : Assimp::Importer::ReadFile(char const*, unsigned int) /dgt/ram/bin/lib/libGraphicsGL.so : Node::LoadFromFile(std::__cxx11::basic_string<char, std::char_traits<char>, std::allocator<char> > const&, Node**) /dgt/ram/bin/lib/libGraphicsGL.so : LoadSceneFromFile() ../lib/libGameSnowKingdom_SP_conv.so : MosDynamicLinkFrame::Initialize(SceneLib::SceneMgr&, NGL::ResourcesMgr&) ../lib/libGameSnowKingdom_SP_conv.so : SceneLib::SceneMgr::LoadObject(pugi::xml_node const&, MOS::XMLMgr*, NGL::ResourcesMgr*) ../lib/libGameSnowKingdom_SP_conv.so : SceneLib::SceneMgr::LoadObject(pugi::xml_node const&, MOS::XMLMgr*, NGL::ResourcesMgr*) ../lib/libGameSnowKingdom_SP_conv.so : SceneLib::SceneMgr::LoadObject(char const*, MOS::XMLMgr*, NGL::ResourcesMgr*) ../lib/libGameSnowKingdom_SP_conv.so : SceneLib::SceneMgr::LoadObject(pugi::xml_node const&, MOS::XMLMgr*, NGL::ResourcesMgr*) ../lib/libGameSnowKingdom_SP_conv.so : SceneLib::SceneMgr::LoadObject(char const*, MOS::XMLMgr*, NGL::ResourcesMgr*) ../lib/libGameSnowKingdom_SP_conv.so : SceneLib::SceneMgr::Load(char const*, MOS::XMLMgr*, NGL::ResourcesMgr*) ../lib/libGameSnowKingdom_SP_conv.so : NGLSlot::GameBase::LoadResources(NGL::ResourcesMgr*)\n" +
                "../lib/libGameSnowKingdom_SP_conv.so : DynamicLink::GameBase::LoadResources(NGL::ResourcesMgr*)\n" +
                "../lib/libGameSnowKingdom_SP_conv.so : SnowKingdom::Main::LoadResources(NGL::ResourcesMgr*)\n" +
                "/dgt/ram/bin/lib/libOldSystem.so.1 : GameProxy::LoadGame()\n" +
                "/dgt/ram/bin/lib/libOldSystem.so.1 : GameProxy::Load()\n" +
                "/dgt/ram/bin/lib/libOldSystem.so.1 : GameProxy::OnLoad()\n" +
                "/dgt/ram/bin/lib/libOldSystem.so.1 : LoadNext()\n" +
                "/dgt/ram/bin/lib/libOldSystem.so.1 : OnTimer(int)\n" +
                "/dgt/ram/bin/lib/libOldSystem.so.1 : OldSystem_BeginDraw() ./Launcher : main()\n" +
                "/lib/x86_64-linux-gnu/libc.so.6 : __libc_start_main()\n" +
                "/dgt/ram/bin/Desk-games-prj/Desk-games: line 780: 19945 Segmentation fault      ./Launcher -fullscreen -machine_config_file_direct \"\${conf_file}\" \$extra_options\n" +
                "2025.11.07 - Xtension Link Volume 2 Spain Converter-v166.114-108141 BUILD_TAG : 'jenkins-TEST2-Build-v3-4558'\n" +
                "STRUCTURE_VERSION : 'v1.2'\n" +
                "SYSTEM_BRANCH : 'xl-spain25-converter-stage7'\n" +
                "GAME_BRANCH : 'xl-spain25-converter-stage7'\n" +
                "AUX_BRANCH : 'xl-spain25-converter-stage7'\n" +
                "GRAPHICS_BRANCH : 'xl-spain25-converter-stage7'\n" +
                "MATH_BRANCH : 'xl-spain25-converter-stage7'\n" +
                "=============\n" +
                "error loading Data/Games/SnowKingdom_SP_conv/flip_screen/object.xml\n" +
                "[MOS-XML] error creating object for field data error loading %BALL_BGR_INACTIVE% [MOS-XML] error creating object for field data error loading %BALL_BGR_INACTIVE% [MOS-XML] error creating object for field data error loading %BALL_BGR_INACTIVE% [MOS-XML] error creating object for field data error loading %BALL_BGR_INACTIVE% [MOS-XML] error creating object for field data error loading %BALL_BGR_INACTIVE% [MOS-XML] error creating object for field data error loading %BALL_BGR_INACTIVE% [MOS-XML] error creating object for field data error loading %BALL_BGR_INACTIVE% [MOS-XML] error creating object for field data error loading %BALL_BGR_INACTIVE% ERROR!  FILE NOT FOUND Data/NGLLib1/vip_control_panel/Panther_Mech/constants.xml\n" +
                "error loading Data/Games/SnowKingdom_SP_con\n" +
                "+++++++++++++++++++++++++++++++++++++++++++1\n"
    )
}

//@SpringBootApplication
//@EnableAsync
//@EnableScheduling
//class VkTeamBotApplication{
//
//
//	@Bean
//	fun init(
//		client: BotApiClient,
//		handler: EventsResolver,
////		userRepository: UserRepository,
////		controller: BotApiClientController
//	): CommandLineRunner {
//
//		return CommandLineRunner {
//			client.addOnEventFetchListener { events ->
//				events?.forEach {
////					getLogger().info(it.toString())
////					handler.handle(it)
//				}
//			}
//		}
//	}
//}
//
//fun main(args: Array<String>) {
//	runApplication<VkTeamBotApplication>(*args)
//}


//@SpringBootApplication
//class VkTeamBotApplication

//fun main(args: Array<String>) {
////	runApplication<VkTeamBotApplication>(*args)
//	val application = runApplication<VkTeamBotApplication>(*args)
//	val sempleStart = application.getBean<SimpleStart>()
//	sempleStart.start()
//
//
//
//}