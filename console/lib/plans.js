// Sellable plans for the automatic checkout.
// Single place to change prices, device limits and which features each tier unlocks.
// Features not listed here default to "allowed" in the app (only an explicit
// `false` locks a page), so every flag is spelled out per tier.

export const FEATURE_KEYS = [
    'mobile', 'trustBuilder', 'autoReply', 'chatbot', 'liveChat',
    'groupGrabber', 'aiAutomation', 'forms', 'aiCampaigns',
];

function features(on) {
    const out = {};
    for (const k of FEATURE_KEYS) out[k] = on.includes(k);
    return out;
}

export const PLANS = {
    starter: {
        id: 'starter',
        name: 'Starter',
        price: 999,            // INR, per year
        deviceLimit: 2,
        durationPlan: 'yearly',
        features: features(['autoReply']),
        highlights: [
            '2 WhatsApp devices',
            'Bulk campaigns, scheduling & safety limits',
            'All template types, contacts & groups',
            'Opt-out management & auto reply',
            'Windows + Android apps',
        ],
    },
    pro: {
        id: 'pro',
        name: 'Professional',
        price: 1499,
        deviceLimit: 4,
        durationPlan: 'yearly',
        popular: true,
        features: features(['mobile', 'trustBuilder', 'autoReply', 'chatbot', 'liveChat', 'groupGrabber', 'aiAutomation', 'forms', 'aiCampaigns']),
        highlights: [
            '4 WhatsApp devices',
            'Everything in Starter',
            'AI Automation: lead capture & instant forwarding',
            'AI Campaigns (a unique message for every contact)',
            'Chatbot flows, forms & live chat',
            'Group Grabber & Trust Builder',
            'Open on Mobile',
        ],
    },
    business: {
        id: 'business',
        name: 'Business',
        price: 2499,
        deviceLimit: 10,
        durationPlan: 'yearly',
        features: features(FEATURE_KEYS),
        highlights: [
            '10 WhatsApp devices',
            'Everything in Professional',
            'Priority support',
            'Need more devices or features? Contact support',
        ],
    },
};

export function publicPlans() {
    return Object.values(PLANS).map(p => ({
        id: p.id, name: p.name, price: p.price, deviceLimit: p.deviceLimit,
        popular: !!p.popular, highlights: p.highlights,
    }));
}
