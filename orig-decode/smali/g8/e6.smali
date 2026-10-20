.class public final Lg8/e6;
.super Ljava/lang/Object;


# static fields
.field public static final c:Lg8/k4;


# instance fields
.field public final a:Lg8/c6;

.field public final b:Lg8/s2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lg8/k4;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lg8/e6;->c:Lg8/k4;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    sget-object v0, Lg8/c6;->a:Lg8/k4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lg8/l;->r()Lg8/s2;

    move-result-object v1

    iput-object v1, p0, Lg8/e6;->b:Lg8/s2;

    iput-object v0, p0, Lg8/e6;->a:Lg8/c6;

    return-void
.end method
