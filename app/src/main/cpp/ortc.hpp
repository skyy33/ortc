#ifndef MSC_ORTC_HPP
#define MSC_ORTC_HPP

#include "json.hpp"
#include <string>

namespace mediasoupclient
{
namespace ortc
{
	nlohmann::json getExtendedRtpCapabilities(nlohmann::json& localCaps, const nlohmann::json& remoteCaps);
	nlohmann::json getRecvRtpCapabilities(const nlohmann::json& extendedRtpCapabilities);
	nlohmann::json getSendingRtpParameters(
	  const std::string& kind, const nlohmann::json& extendedRtpCapabilities);
	nlohmann::json getSendingRemoteRtpParameters(
	  const std::string& kind, const nlohmann::json& extendedRtpCapabilities);
	bool canSend(const std::string& kind, const nlohmann::json& extendedRtpCapabilities);
	bool canReceive(const nlohmann::json& rtpParameters, const nlohmann::json& extendedRtpCapabilities);




//	//warp
	nlohmann::json getExtendedRtpCapabilities11(std::string& loaclCapsJson, std::string& remoteCapsJson);
//
//	nlohmann::json getRecvRtpCapabilities11(std::string& extendedRtpCapabilities);
//
//	nlohmann::json getSendingRtpParameters11(const std::string& kind, const std::string& extendedRtpCapabilities);
//
//	nlohmann::json getSendingRemoteRtpParameters11(const std::string& kind, const std::string& extendedRtpCapabilities);
//
//	bool canSend11(const std::string& kind, const std::string& extendedRtpCapabilities);
//	bool canReceive11(const std::string& rtpParameters, const std::string& extendedRtpCapabilities);

} // namespace ortc
} // namespace mediasoupclient

#endif
