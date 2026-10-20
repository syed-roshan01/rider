.class public final Lu1/k1;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lu1/k1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lu1/k1;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lu1/k1;->a:Lu1/k1;

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/accessibility/AccessibilityManager;II)I
    .locals 0

    invoke-virtual {p1, p2, p3}, Landroid/view/accessibility/AccessibilityManager;->getRecommendedTimeoutMillis(II)I

    move-result p1

    return p1
.end method
