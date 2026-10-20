.class public final Li4/g;
.super Ld9/j;

# interfaces
.implements Lc9/a;


# static fields
.field public static final a:Li4/g;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Li4/g;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ld9/j;-><init>(I)V

    sput-object v0, Li4/g;->a:Li4/g;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    new-instance v0, Lx9/w;

    invoke-direct {v0}, Lx9/w;-><init>()V

    return-object v0
.end method
