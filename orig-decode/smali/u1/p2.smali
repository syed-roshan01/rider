.class public final Lu1/p2;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lu1/p2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lu1/p2;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lu1/p2;->a:Lu1/p2;

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/RenderNode;)V
    .locals 0

    invoke-virtual {p1}, Landroid/view/RenderNode;->discardDisplayList()V

    return-void
.end method
