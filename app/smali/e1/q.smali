.class public final Le1/q;
.super Ljava/lang/Object;


# static fields
.field public static final a:Le1/q;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Le1/q;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Le1/q;->a:Le1/q;

    return-void
.end method


# virtual methods
.method public final a(Landroid/graphics/Canvas;Z)V
    .locals 0

    if-eqz p2, :cond_0

    invoke-static {p1}, Le1/b;->k(Landroid/graphics/Canvas;)V

    goto :goto_0

    :cond_0
    invoke-static {p1}, Le1/b;->B(Landroid/graphics/Canvas;)V

    :goto_0
    return-void
.end method
