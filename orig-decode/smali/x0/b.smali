.class public abstract Lx0/b;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lm0/m3;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Lx0/a;->a:Lx0/a;

    new-instance v1, Lm0/m3;

    invoke-direct {v1, v0}, Lm0/z;-><init>(Lc9/a;)V

    sput-object v1, Lx0/b;->a:Lm0/m3;

    return-void
.end method
